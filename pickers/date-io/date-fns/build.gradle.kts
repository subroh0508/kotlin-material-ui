group = groupId
version = libraryVersion

plugins {
    kotlin("js")
}

dependencies {
    api(project(":pickers:date-io"))

    api(npm("@date-io/date-fns", Libraries.Npm.dateIo))
    api(npm("date-fns", Libraries.Npm.dateFns))
}
