import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfigWriter

group = Packages.group

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
                devServer = KotlinWebpackConfigWriter.DevServer(
                    port = 8080,
                    contentBase = listOf("${projectDir.path}/src/main/resources")
                )
            }
        }
    }

    sourceSets {
        val main by getting {
            dependencies {
                implementation(Libraries.KotlinJs.stdlib)
                implementation(Libraries.KotlinJs.html)
                implementation(Libraries.KotlinJs.react)
                implementation(Libraries.KotlinJs.reactDom)
                implementation(Libraries.KotlinJs.styled)
                implementation(Libraries.KotlinJs.materialUi)
                implementation(npm("core-js", Versions.Npm.coreJs))
                implementation(npm("react", Versions.Npm.react))
                implementation(npm("react-dom", Versions.Npm.react))
                implementation(npm("styled-components", Versions.Npm.styledComponent))
                implementation(npm("inline-style-prefixer", Versions.Npm.inlineStyledPrefixer))
                implementation(npm("@material-ui/core", Versions.Npm.materialUi))
                //testimplementation(Libraries.KotlinJs.test)
            }
        }
    }
}
