import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension

group = groupId
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
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
        maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
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
