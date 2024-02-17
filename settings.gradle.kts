pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KNOOPSM_multiplatform"
include(":KNOOPSM_android")
include(":KNOOPSM_shared")