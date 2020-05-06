package materialui.pickers.components.provider

import kotlinext.js.jsObject
import react.FunctionalComponent
import react.RBuilder
import react.createElement

class LocalizationProviderBuilder internal constructor(
    private val component: FunctionalComponent<LocalizationProviderProps>,
    private val props: LocalizationProviderProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: LocalizationProviderProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(component, props, *childList.toTypedArray())
}
