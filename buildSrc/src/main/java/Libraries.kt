@Suppress("unused")
object Libraries {
    object Plugin {
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    }

    const val bintray = "1.8.4"

    object Kotlin {
        const val version = "1.3.72"
        const val js = "org.jetbrains.kotlin:kotlin-stdlib-js:$version"
        const val jsTest = "org.jetbrains.kotlin:kotlin-test-js:$version"

        const val kotlinextVersion = "1.0.1-pre.97-kotlin-$version"
        const val kotlinext = "org.jetbrains:kotlin-extensions:$kotlinextVersion"

        const val reactVersion = "${Npm.react}-pre.97-kotlin-$version"
        const val react = "org.jetbrains:kotlin-react:$reactVersion"
        const val reactDom = "org.jetbrains:kotlin-react-dom:$reactVersion"

        const val htmlVersion = "0.7.1"
        const val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"

        const val cssVersion = "1.0.0-pre.97-kotlin-$version"
        const val css = "org.jetbrains:kotlin-css-js:$cssVersion"

        const val styledVersion = "1.0.0-pre.97-kotlin-$version"
        const val styled = "org.jetbrains:kotlin-styled:$styledVersion"
    }

    object Npm {
        const val coreJs = "~3.1.4"
        const val styledComponent = "^4.3.2"
        const val inlineStyledPrefixer = "^5.1.0"
        const val react = "16.13.0"

        object MaterialUi {
            const val core = "4.9.8"
            const val lab = "4.0.0-alpha.47"
        }
    }
}
