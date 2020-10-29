@Suppress("unused")
object Libraries {
    object Plugin {
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    }

    const val bintray = "1.8.5"

    object Kotlin {
        const val version = "1.4.10"
        const val wrappersBuild = "pre.124-kotlin-$version"

        const val js = "org.jetbrains.kotlin:kotlin-stdlib-js:$version"
        const val jsTest = "org.jetbrains.kotlin:kotlin-test-js:$version"

        const val reactVersion = "${Npm.react}-$wrappersBuild"
        const val react = "org.jetbrains:kotlin-react:$reactVersion"
        const val reactDom = "org.jetbrains:kotlin-react-dom:$reactVersion"

        const val htmlVersion = "0.7.2"
        const val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"

        const val cssVersion = "1.0.0-$wrappersBuild"
        const val css = "org.jetbrains:kotlin-css-js:$cssVersion"

        const val styledVersion = "${Npm.styledComponent}-$wrappersBuild"
        const val styled = "org.jetbrains:kotlin-styled:$styledVersion"

        const val extensionsVersion = "1.0.1-$wrappersBuild"
        const val extensions = "org.jetbrains:kotlin-extensions:$extensionsVersion"
    }

    object Npm {
        const val styledComponent = "5.2.0"
        const val inlineStyledPrefixer = "^5.1.2"
        const val react = "16.13.1"

        const val dateIo = "^2.6.0"
        const val dateFns = "^2.12.0"
        const val dayjs = "^1.8.16"
        const val luxon = "^1.24.1"
        const val moment = "^2.25.3"

        object MaterialUi {
            const val core = "4.11.0"
            const val lab = "4.0.0-alpha.54"
            const val pickers = "4.0.0-alpha.7"
        }
    }
}
