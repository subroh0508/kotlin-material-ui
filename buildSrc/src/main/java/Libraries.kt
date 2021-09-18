@Suppress("unused")
object Libraries {
    class JsWrappers(kotlinVersion: String) {
        private val prefix = "org.jetbrains.kotlin-wrappers:kotlin-"

        private val bomVersion = "0.0.1-pre.246-kotlin-$kotlinVersion"
        val bom = "${prefix}wrappers-bom:$bomVersion"

        val react = "${prefix}react"
        val reactDom = "${prefix}react-dom"
        val css = "${prefix}css"
        val styled = "${prefix}styled"
        val extensions = "${prefix}extensions"

        private val htmlVersion = "0.7.3"
        val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"
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
