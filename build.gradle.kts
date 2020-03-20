group = Packages.group
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        google()
        jcenter()
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
    }
}
