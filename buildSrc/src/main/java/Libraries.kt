@Suppress("unused")
object Libraries {
    object Plugin {
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    }

    const val bintray = "1.8.4"

    object Kotlin {
        const val version = "1.3.70"
        const val js = "org.jetbrains.kotlin:kotlin-stdlib-js:$version"
        const val jsTest = "org.jetbrains.kotlin:kotlin-test-js:$version"

        const val reactVersion = "${Npm.react}-pre.94-kotlin-$version"
        const val react = "org.jetbrains:kotlin-react:$reactVersion"
        const val reactDom = "org.jetbrains:kotlin-react-dom:$reactVersion"

        const val htmlVersion = "0.7.1"
        const val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"

        const val cssVersion = "1.0.0-pre.94-kotlin-$version"
        const val css = "org.jetbrains:kotlin-css-js:$cssVersion"

        const val styledVersion = "1.0.0-pre.94-kotlin-$version"
        const val styled = "org.jetbrains:kotlin-styled:$styledVersion"
    }

    object Npm {
        const val coreJs = "~3.1.4"
        const val materialUi = "3.9.2"
        const val styledComponent = "^4.3.2"
        const val inlineStyledPrefixer = "^5.1.0"
        const val react = "16.13.0"
    }
}
