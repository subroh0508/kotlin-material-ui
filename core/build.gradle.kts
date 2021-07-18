group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    id("maven-publishing")
}

dependencies {
    val wrappers = Libraries.JsWrappers(kotlinVersion)
    api(wrappers.html)
    api(wrappers.react)
    api(wrappers.reactDom)
    api(wrappers.css)
    api(wrappers.extensions)

    api(npm("@material-ui/core", Libraries.Npm.MaterialUi.core))

    testImplementation(kotlinTestJs)
}
