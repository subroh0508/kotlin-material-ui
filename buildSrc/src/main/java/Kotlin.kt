@file:Suppress("HardcodedStringLiteral")

import org.gradle.api.Project

val Project.kotlinVersion get() = version("kotlin")
val Project.kotlinStdlibJs get() = "org.jetbrains.kotlin:kotlin-stdlib-js:$kotlinVersion"
val Project.kotlinTestJs get() = "org.jetbrains.kotlin:kotlin-test-js:$kotlinVersion"