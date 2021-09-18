@Suppress("unused")
object Libraries {
    class JsWrappers(kotlinVersion: String) {
        private val wrappersBuild = "pre.246-kotlin-$kotlinVersion"
        private val prefix = "org.jetbrains.kotlin-wrappers:kotlin"

        private val reactVersion = "${Npm.react}-$wrappersBuild"
        val react = "$prefix-react:$reactVersion"
        val reactDom = "$prefix-react-dom:$reactVersion"

        private val htmlVersion = "0.7.3"
        val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"

        private val cssVersion = "1.0.0-$wrappersBuild"
        val css = "$prefix-css-js:$cssVersion"

        private val styledVersion = "${Npm.styledComponent}-$wrappersBuild"
        val styled = "$prefix-styled:$styledVersion"

        private val extensionsVersion = "1.0.1-$wrappersBuild"
        val extensions = "$prefix-extensions:$extensionsVersion"
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
