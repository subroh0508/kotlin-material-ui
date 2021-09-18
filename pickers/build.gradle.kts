group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    id("maven-publishing")
}

dependencies {
    api(project(":core"))
    api(project(":pickers:date-io"))

    api(npm("@material-ui/pickers", Libraries.Npm.MaterialUi.pickers))

    testImplementation(kotlinTestJs)
}
