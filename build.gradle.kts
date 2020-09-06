import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension

group = Packages.group
version = "1.0-SNAPSHOT"

plugins {
    kotlin("js") apply false
}

internal val Task.jsOutputDir: File
    get() = project.rootProject.buildDir
        .resolve("js/packages/${project.name}/kotlin")

internal val Task.jsOutputFileName: String
    get() = "${project.name}.js"

val Task.jsOutputFile: String
    get() = jsOutputDir.resolve(jsOutputFileName).absolutePath

subprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        maven(url = "http://dl.bintray.com/kotlin/kotlinx.html")
        maven(url = "http://dl.bintray.com/kotlin/kotlin-js-wrappers")
    }

    if (project.name != "sample") {
        jsPlugin()
    }
}

fun Project.jsPlugin() {
    plugins.withType<KotlinJsPluginWrapper> {
        extensions.configure<KotlinJsProjectExtension> {
            js {
                browser()
            }

            tasks.withType<KotlinJsCompile>().configureEach {
                kotlinOptions {
                    moduleKind = "commonjs"

                    if (name == "compileKotlinJs") {
                        outputFile = jsOutputFile
                        sourceMapEmbedSources = "always"
                        sourceMap = true
                    } else {
                        sourceMap = false
                    }
                }
            }
        }
    }
}
