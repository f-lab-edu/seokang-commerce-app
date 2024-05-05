plugins {
    id("seokang.plugin.feature")
    alias(libs.plugins.seokang.library.jacoco)
}

android {
    namespace = "me.seokang.commerce.main"

    defaultConfig.consumerProguardFiles("consumer-rules.pro")
}