plugins {
    alias(libs.plugins.seokang.android.application)
}

android {
    namespace = "me.seokang.commerce.app"

    defaultConfig {
        applicationId = "me.seokang.commerce"
        versionCode = 1
        versionName = "1.0"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:domain"))
    implementation(project(":core:ui"))
    implementation(project(":feature:main"))
}