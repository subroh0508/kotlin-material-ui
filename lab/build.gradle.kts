group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    id("maven-publishing")
}

dependencies {
    api(project(":core"))

    api(npm("@material-ui/lab", Libraries.Npm.MaterialUi.lab))

    testImplementation(kotlinTestJs)
}
