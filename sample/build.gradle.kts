import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

group = Packages.group
version = "1.0-SNAPSHOT"

plugins {
    kotlin("js")
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
        useCommonJs()
        browser {
            runTask {
                sourceMaps = true
                devServer = KotlinWebpackConfig.DevServer(
                    port = 8080,
                    contentBase = listOf("${projectDir.path}/src/main/resources")
                )
                outputFileName = "kotlin-material-ui-sample.js"
            }
            webpackTask {
                outputFileName = "kotlin-material-ui-sample.js"
            }
        }
    }

    sourceSets {
        val main by getting {
            dependencies {
                implementation(project(":core"))
                implementation(project(":lab"))
                implementation(Libraries.Kotlin.js)
                implementation(Libraries.Kotlin.styled)
            }
        }

        val test by getting {
            dependencies {
                implementation(Libraries.Kotlin.jsTest)
            }
        }
    }
}
