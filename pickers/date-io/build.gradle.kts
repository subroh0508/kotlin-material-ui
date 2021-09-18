group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    //id("maven-publishing")
}

dependencies {
    val wrappers = Libraries.JsWrappers(kotlinVersion)
    api(enforcedPlatform(wrappers.bom))
    api(wrappers.extensions)

    api(npm("@date-io/core", Libraries.Npm.dateIo))
}
