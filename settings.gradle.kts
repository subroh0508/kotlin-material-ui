include("core", "sample")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }

    resolutionStrategy {
        eachPlugin {
            when {
                requested.id.id.startsWith("org.jetbrains.kotlin") -> useModule(Libraries.Plugin.kotlinGradle)
                requested.id.id == "kotlinx-serialization" -> useModule(Libraries.Plugin.kotlinxSerialization)
            }
        }
    }
}
