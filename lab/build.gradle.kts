group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
//    id("maven-publishing")
}

dependencies {
    api(project(":core"))
    api(Libraries.Kotlin.extensions)
    api(npm("@material-ui/lab", Libraries.Npm.MaterialUi.lab))

    testImplementation(Libraries.Kotlin.jsTest)
}
