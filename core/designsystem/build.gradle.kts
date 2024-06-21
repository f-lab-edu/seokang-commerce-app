plugins {
    alias(libs.plugins.seokang.android.library)
    alias(libs.plugins.seokang.android.library.compose)
}

android {
    namespace = "me.seokang.commerce.ui"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
}