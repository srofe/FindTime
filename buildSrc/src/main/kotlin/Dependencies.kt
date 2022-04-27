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

}

object Deps {
    const val material = "com.google.android.material:material:${Versions.material}"
    const val app_compat = "androidx.appcompat:appcompat:${Versions.app_compat}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_gradle_plugin}"
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val napier = "io.github.aakira:napier:${Versions.napier}"
    const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinxDateTime}"
}
