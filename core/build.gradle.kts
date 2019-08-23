group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    `maven-publish`
    id("com.jfrog.bintray") version Versions.bintray
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
                implementation(Libraries.KotlinJs.stdlib)
                implementation(Libraries.KotlinJs.html)
                implementation(Libraries.KotlinJs.react)
                implementation(Libraries.KotlinJs.reactDom)
                implementation(Libraries.KotlinJs.styled)
                implementation(npm("core-js", Versions.Npm.coreJs))
                implementation(npm("react", Versions.Npm.react))
                implementation(npm("react-dom", Versions.Npm.react))
                implementation(npm("styled-components", Versions.Npm.styledComponent))
                implementation(npm("inline-style-prefixer", Versions.Npm.inlineStyledPrefixer))
                implementation(npm("@material-ui/core", Versions.Npm.materialUi))
            }
        }

        val test by getting {
            dependencies {
                implementation(Libraries.KotlinJs.test)
            }
        }
    }
}

apply(from = file("${rootDir.path}/gradle/bintray.gradle"))
