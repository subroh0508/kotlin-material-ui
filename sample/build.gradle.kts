import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

group = groupId
version = "1.0-SNAPSHOT"

plugins {
    kotlin("js")
}

kotlin {
    js(IR) {
        useCommonJs()
        binaries.executable()

        browser {
            runTask {
                sourceMaps = true
                devServer = KotlinWebpackConfig.DevServer(
                    port = 8080,
                    contentBase = mutableListOf("${projectDir.path}/src/main/resources")
                )
                outputFileName = "kotlin-material-ui-sample.js"
            }
            webpackTask {
                outputFileName = "kotlin-material-ui-sample.js"
            }
        }
    }

    sourceSets {
        named("main") {
            dependencies {
                val wrappers = Libraries.JsWrappers(kotlinVersion)

                implementation(wrappers.react)
                implementation(wrappers.reactDom)
                // implementation(project(":core"))
                // implementation(project(":lab"))
                // implementation(project(":pickers"))
                // implementation(project(":pickers:date-io:date-fns"))
                // implementation(Libraries.JsWrappers(kotlinVersion).styled)
            }
        }

        named("test") {
            dependencies {
                implementation(kotlinTestJs)
            }
        }
    }
}
