rootProject.name = "dd-metrics-library"

include(
        "dd-metrics-library-core",
        "dd-metrics-library-spring-boot"
)

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        val kotlinVersion = "1.7.10"
        val dokkaVersion = "1.7.10"
        val kotestVersion = "5.4.2"
        val kotlinterVersion = "3.11.1"

        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        id("org.jetbrains.dokka") version dokkaVersion
        id("io.kotest.multiplatform") version kotestVersion
        id("org.jmailen.kotlinter") version kotlinterVersion
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
