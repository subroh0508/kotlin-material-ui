package materialui.styles.themeprovider

import kotlinext.js.jsObject
import materialui.styles.muitheme.MuiTheme
import react.*

class ThemeProviderBuilder internal constructor(
    val type: ComponentType<PropsWithChildren>,
    val theme: MuiTheme,
    private val props: PropsWithChildren = jsObject { }
) : RBuilderImpl() {
    init {
        props.asDynamic()["theme"] = theme
    }

    fun attrs(handler: PropsWithChildren.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}
