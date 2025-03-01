/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.focus.fragment.onboarding

import android.content.Context
import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import mozilla.telemetry.glean.private.NoExtras
import org.mozilla.focus.GleanMetrics.Onboarding
import org.mozilla.focus.R
import org.mozilla.focus.ext.requireComponents
import org.mozilla.focus.ui.theme.FocusTheme

class OnboardingFirstFragment : Fragment() {
    private lateinit var onboardingInteractor: OnboardingInteractor

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val transition =
            TransitionInflater.from(context).inflateTransition(R.transition.firstrun_exit)
        exitTransition = transition
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        onboardingInteractor = DefaultOnboardingInteractor(
            DefaultOnboardingController(
                onboardingStorage = OnboardingStorage(requireContext()),
                appStore = requireComponents.appStore,
                context = requireActivity(),
                selectedTabId = requireComponents.store.state.selectedTabId
            )
        )
        return ComposeView(requireContext()).apply {
            setContent {
                FocusTheme {
                    OnBoardingFirstScreenCompose(
                        onGetStartedButtonClicked = {
                            Onboarding.getStartedButton.record(NoExtras())
                            onboardingInteractor.onGetStartedButtonClicked()
                        },
                        onCloseButtonClick = {
                            Onboarding.firstScreenCloseButton.record(NoExtras())
                            onboardingInteractor.onFinishOnBoarding()
                        }
                    )
                }
            }
        }
    }
}
