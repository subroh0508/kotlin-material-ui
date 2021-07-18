group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    id("maven-publishing")
}

dependencies {
    api(project(":core"))
    api(project(":pickers:date-io"))

    val wrappers = Libraries.JsWrappers(kotlinVersion)
    api(wrappers.html)
    api(wrappers.react)
    api(wrappers.reactDom)
    api(wrappers.css)
    api(wrappers.extensions)

    api(npm("react", Libraries.Npm.react))
    api(npm("react-dom", Libraries.Npm.react))
    api(npm("@material-ui/core", Libraries.Npm.MaterialUi.core))
    api(npm("@material-ui/pickers", Libraries.Npm.MaterialUi.pickers))

    testImplementation(kotlinTestJs)
}
