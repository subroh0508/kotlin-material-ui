group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    // id("com.jfrog.bintray")
}

repositories {
    mavenLocal()
    jcenter()
    maven(url = "http://dl.bintray.com/kotlin/kotlin-js-wrappers")
}

dependencies {
    api(project(":pickers:date-io"))
    api(Libraries.Kotlin.extensions)
    api(npm("@date-io/date-fns", Libraries.Npm.dateIo))
    api(npm("date-fns", Libraries.Npm.dateFns))
}
