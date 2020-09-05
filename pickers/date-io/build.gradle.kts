group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    //`maven-publish`
    //id("com.jfrog.bintray")
}

repositories {
    mavenLocal()
    jcenter()
}

kotlin {
    sourceSets {
        val main by getting {
            dependencies {
                implementation(Libraries.Kotlin.js)
                api(npm("@date-io/core", Libraries.Npm.dateIo))
            }
        }
    }
}
