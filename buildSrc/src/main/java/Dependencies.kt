/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

object Versions {
    const val compose_version = "1.2.1"
    const val compose_compiler = "1.1.1"
    const val leakcanary = "2.8.1"
    const val sentry = "5.7.3"

    object AndroidX {
        const val activity_compose = "1.3.1"
        const val annotation = "1.1.0"
        const val appcompat = "1.3.0"
        const val arch = "2.1.0"
        const val browser = "1.3.0"
        const val core = "1.3.2"
        const val compose = compose_version
        const val compose_constraint_layout = "1.0.1"
        const val constraint_layout = "2.1.4"
        const val cardview = "1.0.0"
        const val recyclerview = "1.2.0"
        const val palette = "1.0.0"
        const val preferences = "1.1.1"
        const val lifecycle = "2.2.0"
        const val splash_screen = "1.0.0-beta01"
    }

    object Google {
        const val material = "1.2.1"
        const val accompanist = "0.16.1"
        const val play = "1.10.3"
    }

    object Kotlin {
        const val version = "1.6.10"
        const val coroutines = "1.6.0"
    }

    object Gradle {
        const val kotlin_plugin = Kotlin.version
        const val android_plugin = "7.2.1"
    }

    object Test {
        const val robolectric = "4.8.1"
        const val mockito = "3.11.0"
        const val androidx_work = "2.7.1"
        const val junit = "5.8.2"
    }

    object Adjust {
        const val adjust = "4.30.1"
        const val install_referrer = "2.2"
    }
}

object Dependencies {
    const val androidx_annotation = "androidx.annotation:annotation:${Versions.AndroidX.annotation}"
    const val androidx_arch_core_testing = "androidx.arch.core:core-testing:${Versions.AndroidX.arch}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
    const val androidx_browser = "androidx.browser:browser:${Versions.AndroidX.browser}"
    const val androidx_cardview = "androidx.cardview:cardview:${Versions.AndroidX.cardview}"
    const val androidx_compose_ui = "androidx.compose.ui:ui:${Versions.AndroidX.compose}"
    const val androidx_compose_ui_test = "androidx.compose.ui:ui-test-junit4:${Versions.AndroidX.compose}"
    const val androidx_compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:${Versions.AndroidX.compose}"
    const val androidx_compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.AndroidX.compose}"
    const val androidx_compose_foundation = "androidx.compose.foundation:foundation:${Versions.AndroidX.compose}"
    const val androidx_compose_material = "androidx.compose.material:material:${Versions.AndroidX.compose}"
    const val androidx_compose_runtime_livedata = "androidx.compose.runtime:runtime-livedata:${Versions.AndroidX.compose}"
    const val androidx_compose_constraint_layout =
        "androidx.constraintlayout:constraintlayout-compose:${Versions.AndroidX.compose_constraint_layout}"
    const val androidx_constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraint_layout}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.core}"
    const val androidx_palette = "androidx.palette:palette-ktx:${Versions.AndroidX.palette}"
    const val androidx_preferences = "androidx.preference:preference-ktx:${Versions.AndroidX.preferences}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerview}"
    const val androidx_lifecycle_process = "androidx.lifecycle:lifecycle-process:${Versions.AndroidX.lifecycle}"
    const val androidx_splash_screen = "androidx.core:core-splashscreen:${Versions.AndroidX.splash_screen}"

    const val google_material = "com.google.android.material:material:${Versions.Google.material}"
    const val google_accompanist_insets_ui = "com.google.accompanist:accompanist-insets-ui:${Versions.Google.accompanist}"
    const val google_play = "com.google.android.play:core:${Versions.Google.play}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Gradle.kotlin_plugin}"
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.Gradle.android_plugin}"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android-core:${Versions.leakcanary}"
    const val sentry = "io.sentry:sentry-android:${Versions.sentry}"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.version}"
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlin.coroutines}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.coroutines}"

    const val adjust = "com.adjust.sdk:adjust-android:${Versions.Adjust.adjust}"
    const val install_referrer = "com.android.installreferrer:installreferrer:${Versions.Adjust.install_referrer}"

    const val testing_robolectric = "org.robolectric:robolectric:${Versions.Test.robolectric}"
    const val testing_mockito = "org.mockito:mockito-core:${Versions.Test.mockito}"
    const val testing_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Kotlin.coroutines}"
    const val androidx_work_testing = "androidx.work:work-testing:${Versions.Test.androidx_work}"

    const val testing_junit_api = "org.junit.jupiter:junit-jupiter-api:${Versions.Test.junit}"
    const val testing_junit_engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.Test.junit}"
    const val testing_junit_params = "org.junit.jupiter:junit-jupiter-params:${Versions.Test.junit}"
}
