group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
//    id("maven-publishing")
}

dependencies {
    api(Libraries.Kotlin.html)
    api(Libraries.Kotlin.react)
    api(Libraries.Kotlin.reactDom)
    api(Libraries.Kotlin.css)
    api(Libraries.Kotlin.extensions)

    api(npm("@material-ui/core", Libraries.Npm.MaterialUi.core))

    testImplementation(Libraries.Kotlin.jsTest)
}
