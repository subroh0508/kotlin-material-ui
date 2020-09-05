group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    //`maven-publish`
    //id("com.jfrog.bintray")
}

kotlin {
    sourceSets {
        val main by getting {
            dependencies {
                implementation(npm("dayjs", Libraries.Npm.dayjs))
            }
        }
    }
}
