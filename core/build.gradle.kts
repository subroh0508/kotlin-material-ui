group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    `maven-publish`
    id("com.jfrog.bintray") version Libraries.bintray
}

repositories {
    mavenLocal()
    jcenter()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    maven(url = "http://dl.bintray.com/kotlin/kotlinx.html")
    maven(url = "http://dl.bintray.com/kotlin/kotlin-js-wrappers")
}

kotlin {
    js(IR) {
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

apply(from = file("${rootDir.path}/gradle/bintray.gradle"))
