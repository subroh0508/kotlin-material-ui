package materialui.styles.stylesprovider

import kotlinext.js.jsObject
import materialui.styles.muitheme.MuiTheme
import react.*

class StyleProviderBuilder internal constructor(
    val type: RComponent<StylesProviderProps, RState>,
    private val props: StylesProviderProps = jsObject { }
) : RBuilderImpl() {
    fun attrs(handler: StylesProviderProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}