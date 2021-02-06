group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
//    id("maven-publishing")
}

dependencies {
    api(project(":core"))
    api(project(":pickers:date-io"))
    api(Libraries.Kotlin.html)
    api(Libraries.Kotlin.react)
    api(Libraries.Kotlin.reactDom)
    api(Libraries.Kotlin.css)
    api(Libraries.Kotlin.extensions)
    api(npm("react", Libraries.Npm.react))
    api(npm("react-dom", Libraries.Npm.react))
    api(npm("@material-ui/core", Libraries.Npm.MaterialUi.core))
    api(npm("@material-ui/pickers", Libraries.Npm.MaterialUi.pickers))

    testImplementation(Libraries.Kotlin.jsTest)
}
