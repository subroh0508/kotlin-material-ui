group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    //id("maven-publishing")
}

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    api(npm("@date-io/core", Libraries.Npm.dateIo))
}
