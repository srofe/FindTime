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

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.compose.ui:ui:1.1.1")
    implementation("androidx.compose.material:material:1.1.1")
    implementation("androidx.compose.compiler:compiler:1.1.1")
    implementation("androidx.compose.foundation:foundation:1.1.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.1")
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
}