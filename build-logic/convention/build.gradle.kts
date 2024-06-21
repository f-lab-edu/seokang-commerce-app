plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.gradle.plugin.kotlin)
    compileOnly(libs.gradle.plugin.android)
    compileOnly(libs.gradle.plugin.ksp)
}

gradlePlugin {
    plugins {
        register("AndroidApplicationPlugin") {
            id = "seokang.plugin.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("AndroidApplicationComposePlugin") {
            id = "seokang.plugin.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("AndroidApplicationJacocoPlugin") {
            id = "seokang.plugin.android.application.jacoco"
            implementationClass = "AndroidApplicationJacocoConventionPlugin"
        }

        register("AndroidLibraryPlugin") {
            id = "seokang.plugin.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("AndroidLibraryComposePlugin") {
            id = "seokang.plugin.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibraryJacoco") {
            id = "seokang.plugin.android.library.jacoco"
            implementationClass = "AndroidLibraryJacocoConventionPlugin"
        }

        register("FeaturePlugin") {
            id = "seokang.plugin.feature"
            implementationClass = "FeatureConventionPlugin"
        }

        register("AndroidHiltPlugin") {
            id = "seokang.plugin.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }

        register("JavaLibraryPlugin") {
            id = "seokang.plugin.java.library"
            implementationClass = "JavaLibraryConventionPlugin"
        }

    }
}