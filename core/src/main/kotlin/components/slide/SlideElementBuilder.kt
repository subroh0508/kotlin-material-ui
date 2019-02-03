package components.slide

import components.slide.enums.SlideDirection
import kotlinext.js.jsObject
import kotlinx.html.Tag
import react.*
import reacttransiton.RTransition
import reacttransiton.RTransitionBuilder

class SlideElementBuilder internal constructor(
    private val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { },
    transition: RTransitionBuilder = RTransitionBuilder()
) : RBuilder(), RTransition by transition {
    init {
        transition.props = props
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var Tag.direction: SlideDirection
        get() = SlideDirection.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["direction"])
        set(value) { props.asDynamic()["direction"] = value.toString() }
    var Tag.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { props.asDynamic()["style"] = value }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { props.asDynamic()["theme"] = value }
}