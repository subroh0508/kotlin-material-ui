group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    `maven-publish`
    id("com.jfrog.bintray")
}

repositories {
    mavenLocal()
    jcenter()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    maven(url = "http://dl.bintray.com/kotlin/kotlinx.html")
    maven(url = "http://dl.bintray.com/kotlin/kotlin-js-wrappers")
}

kotlin {
    target {
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

    sourceSets {
        val main by getting {
            dependencies {
                api(Libraries.Kotlin.js)
                api(npm("@date-io/core", Libraries.Npm.dateIo))
            }
        }
    }
}

apply(from = file("${rootDir.path}/gradle/bintray.gradle"))
