group = Packages.group
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        google()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }

    dependencies {
        classpath(Libraries.Plugin.kotlinGradle)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
    }
}
