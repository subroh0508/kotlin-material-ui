group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    id("maven-publishing")
}

repositories {
    mavenLocal()
    jcenter()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    maven(url = "http://dl.bintray.com/kotlin/kotlinx.html")
    maven(url = "http://dl.bintray.com/kotlin/kotlin-js-wrappers")
}

kotlin {
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

    sourceSets {
        val main by getting {
            dependencies {
                implementation(project(":core"))
                api(project(":pickers:date-io"))
                implementation(Libraries.Kotlin.js)
                implementation(Libraries.Kotlin.html)
                implementation(Libraries.Kotlin.react)
                implementation(Libraries.Kotlin.reactDom)
                implementation(Libraries.Kotlin.css)
                implementation(Libraries.Kotlin.extensions)
                implementation(npm("react", Libraries.Npm.react))
                implementation(npm("react-dom", Libraries.Npm.react))
                implementation(npm("@material-ui/core", Libraries.Npm.MaterialUi.core))
                implementation(npm("@material-ui/pickers", Libraries.Npm.MaterialUi.pickers))
            }
        }

        val test by getting {
            dependencies {
                implementation(Libraries.Kotlin.jsTest)
            }
        }
    }
}

// apply(from = file("${rootDir.path}/gradle/bintray.gradle"))
