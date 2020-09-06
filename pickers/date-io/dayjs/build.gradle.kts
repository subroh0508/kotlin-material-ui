group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    //`maven-publish`
    //id("com.jfrog.bintray")
}

dependencies {
    api(npm("dayjs", Libraries.Npm.dayjs))
}
