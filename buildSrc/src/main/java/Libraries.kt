@Suppress("unused")
object Libraries {
    object Plugin {
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    }

    const val bintray = "1.8.4"

    object Kotlin {
        const val version = "1.3.72"
        const val wrappersBuild = "pre.100-kotlin-$version"

        const val js = "org.jetbrains.kotlin:kotlin-stdlib-js:$version"
        const val jsTest = "org.jetbrains.kotlin:kotlin-test-js:$version"

        const val reactVersion = "${Npm.react}-$wrappersBuild"
        const val react = "org.jetbrains:kotlin-react:$reactVersion"
        const val reactDom = "org.jetbrains:kotlin-react-dom:$reactVersion"

        const val htmlVersion = "0.7.1"
        const val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"

        const val cssVersion = "1.0.0-$wrappersBuild"
        const val css = "org.jetbrains:kotlin-css-js:$cssVersion"

        const val styledVersion = "1.0.0-$wrappersBuild"
        const val styled = "org.jetbrains:kotlin-styled:$styledVersion"

        const val extensionsVersion = "1.0.1-$wrappersBuild"
        const val extensions = "org.jetbrains:kotlin-extensions:$extensionsVersion"
    }

    object Npm {
        const val coreJs = "~3.1.4"
        const val styledComponent = "^4.3.2"
        const val inlineStyledPrefixer = "^5.1.0"
        const val react = "16.13.1"

        const val dateFns = "^2.12.0"
        const val dayjs = "^1.8.16"
        const val luxon = "^1.24.1"
        const val moment = "^2.25.3"

        object MaterialUi {
            const val core = "4.9.8"
            const val lab = "4.0.0-alpha.47"
            const val pickers = "4.0.0-alpha.5"
        }
    }
}
