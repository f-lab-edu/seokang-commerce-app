import com.android.build.gradle.LibraryExtension
import me.seokang.commerce.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
                apply("kotlin-parcelize")
                apply("seokang.plugin.android.library.jacoco")
            }

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)

                defaultConfig.targetSdk = 34

                buildTypes {
                    release {
                        isMinifyEnabled = true
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                }
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            dependencies {
                "testImplementation"(libs.findLibrary("junit4").get())
                "testImplementation"(libs.findLibrary("junit-jupiter").get())
                "testImplementation"(libs.findLibrary("junit-jupiter-api").get())
                "testRuntimeOnly"(libs.findLibrary("junit-jupiter-engine").get())
                "androidTestImplementation"(libs.findLibrary("androidx-junit").get())
                "androidTestImplementation"(libs.findLibrary("androidx-espresso-core").get())
                "androidTestImplementation"(libs.findLibrary("junit4").get())
            }
        }
    }
}