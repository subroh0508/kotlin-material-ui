group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    //`maven-publish`
}

dependencies {
    api(npm("moment", Libraries.Npm.moment))
}
