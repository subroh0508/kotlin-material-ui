package materialui.styles.themeprovider

import kotlinext.js.jsObject
import materialui.styles.muitheme.MuiTheme
import react.*

class ThemeProviderBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    val theme: MuiTheme,
    private val props: RProps = jsObject { }
) : RBuilder() {
    init {
        props.asDynamic()["theme"] = theme
    }

    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}
