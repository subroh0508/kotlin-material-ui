group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    //`maven-publish`
}

dependencies {
    api(npm("moment", Libraries.Npm.moment))
}
