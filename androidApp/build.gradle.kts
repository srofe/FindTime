plugins {
    id(androidApp)
    kotlin(androidPlugin)
}

android {
    compileSdk = Versions.compile_sdk
    defaultConfig {
        applicationId = "com.poddlybonk.findtime.android"
        minSdk = Versions.min_sdk
        targetSdk = Versions.target_sdk
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(Versions.frameworkName))
    implementation(Versions.Deps.material)
    implementation(Versions.Deps.app_compat)
    implementation(Versions.Deps.constraint_layout)
}