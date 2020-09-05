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
                implementation(Libraries.Kotlin.js)
                api(Libraries.Kotlin.html)
                api(Libraries.Kotlin.react)
                api(Libraries.Kotlin.reactDom)
                api(Libraries.Kotlin.css)
                implementation(Libraries.Kotlin.extensions)
                api(npm("@material-ui/core", Libraries.Npm.MaterialUi.core))
            }
        }

        val test by getting {
            dependencies {
                implementation(Libraries.Kotlin.jsTest)
            }
        }
    }
}
