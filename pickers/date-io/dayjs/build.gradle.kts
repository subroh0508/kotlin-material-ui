group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    //`maven-publish`
}

dependencies {
    api(npm("dayjs", Libraries.Npm.dayjs))
}
