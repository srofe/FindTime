const val androidPlugin = "android"
const val androidApp = "com.android.application"
const val androidLib = "com.android.library"
const val multiplatform = "multiplatform"
const val cocoapods = "native.cocoapods"

object Versions {
    const val min_sdk = 21
    const val target_sdk = 32
    const val compile_sdk = 32

    const val kotlin_gradle_plugin = "1.6.21"
    const val android_gradle_plugin = "7.1.3"

    const val material = "1.5.0"
    const val app_compat = "1.4.1"
    const val constraint_layout = "2.1.3"

    const val frameworkName = ":shared"

    object Deps {
        const val material = "com.google.android.material:material:${Versions.material}"
        const val app_compat = "androidx.appcompat:appcompat:${Versions.app_compat}"
        const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    }
}
