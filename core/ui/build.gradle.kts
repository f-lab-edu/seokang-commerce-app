plugins {
    id("seokang.plugin.android.library")
    id("seokang.plugin.android.library.compose")
}

android {
    namespace = "me.seokang.commerce.ui"

    defaultConfig.consumerProguardFiles("consumer-rules.pro")
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
}