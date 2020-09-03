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
/*
    js(BOTH) {
        compilations.all {
            compileKotlinTask.kotlinOptions {
                moduleKind = "commonjs"
                sourceMap = true
                metaInfo = true
                sourceMapEmbedSources = null
            }
        }
        browser()
    }
*/

    sourceSets {
        val main by getting {
            dependencies {
                implementation(Libraries.Kotlin.js)
                api(npm("@date-io/core", Libraries.Npm.dateIo))
            }
        }
    }
}

//apply(from = file("${rootDir.path}/gradle/bintray.gradle"))
