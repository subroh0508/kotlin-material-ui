group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    //id("maven-publishing")
}

dependencies {
    api(npm("@date-io/core", Libraries.Npm.dateIo))
}
