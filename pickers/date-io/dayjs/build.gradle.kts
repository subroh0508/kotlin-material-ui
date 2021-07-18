group = groupId
version = libraryVersion

plugins {
    kotlin("js")
    //`maven-publish`
}

dependencies {
    api(npm("dayjs", Libraries.Npm.dayjs))
}
