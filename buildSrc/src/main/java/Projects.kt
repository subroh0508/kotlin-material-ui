@file:Suppress("HardcodedStringLiteral")

import org.gradle.api.Project

fun Project.version(target: String) = prop("$target.version")
fun Project.packages(property: String) = prop("packages.$property")
