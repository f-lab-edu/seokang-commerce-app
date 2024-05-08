package me.seokang.commerce.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import java.io.File

/**
 * Configure Compose-specific options
 */
internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

    commonExtension.apply {
        buildFeatures.compose = true

        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("composeCompiler").get().requiredVersion
        }
    }

    dependencies {
        // Disabling to work with Alpha
        "api"(platform(libs.findLibrary("compose-bom").get()))
        "implementation"(libs.findBundle("compose").get())
        "debugImplementation"(libs.findBundle("compose.debug").get())
        "androidTestImplementation"(libs.findLibrary("compose-ui-test-junit4").get())
    }
}