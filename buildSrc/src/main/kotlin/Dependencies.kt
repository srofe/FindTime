const val androidPlugin = "android"
const val androidApp = "com.android.application"
const val androidLib = "com.android.library"
const val multiplatform = "multiplatform"
const val cocoapods = "native.cocoapods"

const val frameworkName = ":shared"

object Versions {
    const val min_sdk = 21
    const val target_sdk = 32
    const val compile_sdk = 32

    const val kotlin_gradle_plugin = "1.6.10"
    const val android_gradle_plugin = "7.1.3"

    const val material = "1.5.0"
    const val app_compat = "1.4.1"
    const val constraint_layout = "2.1.3"
    const val napier = "2.1.0"
    const val kotlinxDateTime = "0.3.1"

    const val compose = "1.1.1"
    const val activity_compose = "1.4.0"
    const val lifecycle_runtime = "2.4.1"

}

object Deps {
    const val material = "com.google.android.material:material:${Versions.material}"
    const val app_compat = "androidx.appcompat:appcompat:${Versions.app_compat}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_gradle_plugin}"
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val napier = "io.github.aakira:napier:${Versions.napier}"
    const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinxDateTime}"

    object Compose {
        const val compose = "androidx.compose.ui:ui:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"
        const val compiler = "androidx.compose.compiler:compiler:${Versions.compose}"
        const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
        const val ui_tooling_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val activity_compose = "androidx.activity:activity-compose:${Versions.activity_compose}"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_runtime}"
    }
}
