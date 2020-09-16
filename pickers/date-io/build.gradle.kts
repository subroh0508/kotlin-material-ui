group = Packages.group
version = Packages.version

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
