group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    // id("com.jfrog.bintray")
}

repositories {
    mavenLocal()
    jcenter()
    maven(url = "http://dl.bintray.com/kotlin/kotlin-js-wrappers")
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

                api(project(":pickers:date-io"))

                api(Libraries.Kotlin.extensions)
                api(npm("@date-io/date-fns", Libraries.Npm.dateIo))
                api(npm("date-fns", Libraries.Npm.dateFns))
            }
        }
    }
}

// apply(from = file("${rootDir.path}/gradle/bintray.gradle"))
