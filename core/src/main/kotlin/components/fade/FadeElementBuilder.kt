package components.fade

import kotlinext.js.jsObject
import kotlinx.html.Tag
import react.*
import reacttransiton.RTransition
import reacttransiton.RTransitionBuilder

class FadeElementBuilder internal constructor(
    private val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { },
    transition: RTransitionBuilder = RTransitionBuilder()
) : RBuilder(), RTransition by transition {
    init {
        transition.props = props
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { props.asDynamic()["theme"] = value }
    var Tag.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { props.asDynamic()["style"] = value }
}