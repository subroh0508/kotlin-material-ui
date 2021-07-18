group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    //`maven-publish`
}

dependencies {
    api(npm("luxon", Libraries.Npm.luxon))
}
