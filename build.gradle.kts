group = Packages.group
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Libraries.Plugin.kotlinGradle)
        classpath(Libraries.Plugin.kotlinxSerialization)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}
