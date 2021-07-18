@file:Suppress("HardcodedStringLiteral")

import org.gradle.api.Project

val Project.groupId get() = packages("group")
val Project.libraryVersion get() = packages("version")
