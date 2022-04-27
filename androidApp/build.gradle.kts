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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
}

dependencies {
    implementation(project(frameworkName))

    with(Deps) {
        implementation(material)
        implementation(app_compat)
        implementation(constraint_layout)
        implementation(napier)
    }

    with (Deps.Compose) {
        implementation(compose)
        implementation(material)
        implementation(compiler)
        implementation(foundation)
        implementation(ui_tooling_preview)
        implementation(activity_compose)
        implementation(lifecycle)
    }
}