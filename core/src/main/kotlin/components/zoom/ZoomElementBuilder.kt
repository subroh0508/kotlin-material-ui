package components.zoom

import kotlinext.js.jsObject
import react.*
import reacttransiton.RTransition
import reacttransiton.RTransitionBuilder

class ZoomElementBuilder internal constructor(
    private val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { },
    transition: RTransitionBuilder = RTransitionBuilder()
) : RBuilder(), RTransition by transition {
    init {
        transition.props = props
    }

    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { props.asDynamic()["style"] = value }
    var RProps.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { props.asDynamic()["theme"] = value }
}