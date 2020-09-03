import groovy.util.Node
import java.text.SimpleDateFormat
import java.util.*

plugins {
    id("com.jfrog.bintray")
    `maven-publish`
}

val siteUrl = "https://github.com/subroh0508/kotlin-material-ui"
val githubUrl = "https://github.com/subroh0508/kotlin-material-ui"

val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")

bintray {
    user = project.property("bintray_user")?.toString()
    key = project.property("bintray_key")?.toString()
    setPublications("ToMavenPublication")

    publish = false

    val repoNameSuffix = when (project.name) {
        "lab" -> "-Lab"
        "pickers" -> "-Pickers"
        "date-fns" -> "-DateIO-date-fns"
        else -> ""
    }
    pkg.run {
        repo = "maven"
        name = "Kotlin-Material-UI$repoNameSuffix"
        setLicenses("Apache-2.0")
        websiteUrl = siteUrl
        vcsUrl = "$githubUrl.git"
        issueTrackerUrl = "$githubUrl/issues"
        publicDownloadNumbers = true
        version.name = project.version.toString()
        version.released = dateFormat.format(Date())
    }
}

publishing.publications {
    create<MavenPublication>("ToMavenPublication") {
        println(components.names)
        from(components["kotlin"])
        artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
        groupId = project.group.toString()
        artifactId = project.name
        version = project.version.toString()
        pom.withXml {
            asNode().also { root ->
                root.appendNode("description", "Kotlin Wrapper Library of Material-UI")
                root.appendNode("name", "Kotlin-Material-UI${if (project.name == "core") "" else "/Lab"}")
                root.appendNode("url", githubUrl)
                root.appendPomConfig()
            }
        }
    }
}

fun Node.appendPomConfig() {
    Node(this, "licenses").also { licenses ->
        licenses.appendNode(
            "license", mapOf(
                "name" to "The MIT Licenses",
                "url" to "https://opensource.org/licenses/MIT",
                "distribution" to "repo"
            )
        )
    }
    Node(this, "developers").also { developers ->
        developers.appendNode(
            "developer", mapOf(
                "id" to "subroh0508",
                "name" to "Subroh Nishikori",
                "email" to "subroh.0508@gmail.com"
            )
        )
    }
    Node(this, "scm", mapOf("url" to githubUrl))
}
