package materialui.pickers.components.provider

import kotlinext.js.jsObject
import react.FunctionComponent
import react.RBuilderImpl
import react.createElement

class LocalizationProviderBuilder internal constructor(
    private val component: FunctionComponent<LocalizationProviderProps>,
    private val props: LocalizationProviderProps = jsObject { }
) : RBuilderImpl() {
    val attrs: LocalizationProviderProps get() = props

    fun attrs(handler: LocalizationProviderProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(component, props, *childList.toTypedArray())
}
