plugins {
    alias(libs.plugins.seokang.android.library)
}

android {
    namespace = "me.seokang.commerce.data"
}

dependencies {
    implementation(project(":core:domain"))
}