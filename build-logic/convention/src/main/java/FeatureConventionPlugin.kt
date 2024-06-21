import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
internal class FeatureConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("seokang.plugin.android.library")
                apply("seokang.plugin.android.library.compose")
                apply("seokang.plugin.android.hilt")
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            dependencies {
                "implementation"(project(":core:domain"))
                "implementation"(project(":core:designsystem"))

                "implementation"(libs.findLibrary("androidx.core.ktx").get())

                "implementation"(libs.findLibrary("androidx.lifecycle.runtime.ktx").get())
                "implementation"(libs.findLibrary("androidx.lifecycle.viewmodel.ktx").get())
                "implementation"(libs.findLibrary("androidx.activity.ktx").get())

                "implementation"(libs.findLibrary("kotlinx.coroutines.android").get())
                "implementation"(libs.findLibrary("kotlinx.coroutines.core").get())

            }
        }
    }
}