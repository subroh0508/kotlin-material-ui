import groovy.util.Node
import java.text.SimpleDateFormat
import java.util.*

plugins {
    id("com.jfrog.bintray")
    `maven-publish`
    id("bintray-metadata")
}

val group = "net.subroh0508.kotlinmaterialui"
val libVersion = "0.5.4"

val siteUrl = "https://github.com/subroh0508/kotlin-material-ui"
val githubUrl = "https://github.com/subroh0508/kotlin-material-ui"

val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ")

bintray {
    user = project.property("bintray_user")?.toString()
    key = project.property("bintray_key")?.toString()
    setPublications("ToMavenPublication")

    publish = false

    val repoNameSuffix = when (project.name) {
        "lab" -> "-Lab"
        "pickers" -> "-Pickers"
        "date-io" -> "-DateIO"
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
        version.name = libVersion
        version.released = dateFormat.format(Date())
    }
}

publishing.publications {
    create<MavenPublication>("ToMavenPublication") {
        from(components["kotlin"])
        artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
        groupId = group
        artifactId = project.name
        version = libVersion
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
        Node(licenses, "license").also { license ->
            license.appendNode("name", "The MIT Licenses")
            license.appendNode("url", "https://opensource.org/licenses/MIT")
            license.appendNode("distribution", "repo")
        }
    }
    Node(this, "developers").also { developers ->
        Node(developers, "developer").also { developer ->
            developer.appendNode("id", "subroh0508")
            developer.appendNode("name", "Subroh Nishikori")
            developer.appendNode("email", "in-the-n@me-of.love")
        }
    }
    Node(this, "scm").also { scm ->
        scm.appendNode("url", githubUrl)
    }
}
