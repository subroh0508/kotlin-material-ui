group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    id("maven-publishing")
}

kotlin {
    sourceSets {
        val main by getting {
            dependencies {
                api(project(":core"))
                implementation(Libraries.Kotlin.js)
                implementation(Libraries.Kotlin.extensions)
                api(npm("@material-ui/lab", Libraries.Npm.MaterialUi.lab))
            }
        }

        val test by getting {
            dependencies {
                implementation(Libraries.Kotlin.jsTest)
            }
        }
    }
}
