@Suppress("unused")
object Libraries {
    class JsWrappers(kotlinVersion: String) {
        private val wrappersBuild = "pre.218-kotlin-$kotlinVersion"

        private val reactVersion = "${Npm.react}-$wrappersBuild"
        val react = "org.jetbrains.kotlin-wrappers:kotlin-react:$reactVersion"
        val reactDom = "org.jetbrains.kotlin-wrappers:kotlin-react-dom:$reactVersion"

        private val htmlVersion = "0.7.3"
        val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"

        private val cssVersion = "1.0.0-$wrappersBuild"
        val css = "org.jetbrains.kotlin-wrappers:kotlin-css-js:$cssVersion"

        private val styledVersion = "${Npm.styledComponent}-$wrappersBuild"
        val styled = "org.jetbrains.kotlin-wrappers:kotlin-styled:$styledVersion"

        private val extensionsVersion = "1.0.1-$wrappersBuild"
        val extensions = "org.jetbrains.kotlin-wrappers:kotlin-extensions:$extensionsVersion"
    }

    object Npm {
        const val styledComponent = "5.3.0"
        const val inlineStyledPrefixer = "^5.1.2"
        const val react = "17.0.2"

        const val dateIo = "^2.6.0"
        const val dateFns = "^2.12.0"
        const val dayjs = "^1.8.16"
        const val luxon = "^1.24.1"
        const val moment = "^2.25.3"

        object MaterialUi {
            const val core = "4.12.1"
            const val lab = "4.0.0-alpha.60"
            const val pickers = "4.0.0-alpha.7"
        }
    }
}
