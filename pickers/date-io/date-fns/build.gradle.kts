group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
}

dependencies {
    api(project(":pickers:date-io"))

    val wrappers = Libraries.JsWrappers(kotlinVersion)
    api(wrappers.extensions)

    api(npm("@date-io/date-fns", Libraries.Npm.dateIo))
    api(npm("date-fns", Libraries.Npm.dateFns))
}
