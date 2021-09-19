import java.text.SimpleDateFormat

plugins {
    signing
    `maven-publish`
}

val siteUrl = "https://github.com/subroh0508/kotlin-material-ui"
val githubUrl = "https://github.com/subroh0508/kotlin-material-ui"

val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ")

publishing {
    publications {
        create<MavenPublication>("kotlin") {
            from(components["kotlin"])
            artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
            groupId = project.groupId
            artifactId = project.name
            version = libraryVersion

            metadata()
        }
    }
    val repoNameSuffix = when (project.name) {
        "lab" -> "-Lab"
        "pickers" -> "-Pickers"
        "date-io" -> "-DateIO"
        "date-fns" -> "-DateIO-date-fns"
        else -> ""
    }

    val releasesRepoUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
    val snapshotsRepoUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots/"

    val user = project.property("sonatypeUsername")?.toString()
    val key = project.property("sonatypePassword")?.toString()

    repositories {
        maven {
            name = "Kotlin-Material-UI$repoNameSuffix"
            url = uri(releasesRepoUrl)
            credentials {
                username = user
                password = key
            }
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications["kotlin"])
}

fun MavenPublication.metadata() {
    pom {
        name.set("Kotlin-Material-UI${if (project.name == "core") "" else "/Lab"}")
        description.set("Kotlin Wrapper Library of Material-UI")
        url.set(githubUrl)

        licenses {
            license {
                name.set("The MIT Licenses")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        developers {
            developer {
                id.set("subroh0508")
                name.set("Subroh Nishikori")
                email.set("in-the-n@me-of.love")
            }
        }

        scm {
            url.set(githubUrl)
        }
    }
}
