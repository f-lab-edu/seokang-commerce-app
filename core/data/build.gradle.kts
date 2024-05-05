plugins {
    id("seokang.plugin.android.library")
    alias(libs.plugins.seokang.library.jacoco)
}

android {
    namespace = "me.seokang.commerce.data"
}

dependencies {
    implementation(project(":core:domain"))
}