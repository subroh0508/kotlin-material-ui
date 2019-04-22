package materialui.reacttransiton

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.*
import react.dom.RDOMBuilder

abstract class RTransitionGroupBuilder<T: Tag>(
    private val type: RComponent<RProps, RState>,
    factory: (TagConsumer<Unit>) -> T
) : RDOMBuilder<T>(factory) {
    init {
        setProp("component", attrs.tagName)
    }

    var Tag.appear: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["appear"]
        set(value) { props.asDynamic()["appear"] = value }
    var Tag.enter: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["enter"]
        set(value) { props.asDynamic()["enter"] = value }
    var Tag.exit: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["exit"]
        set(value) { props.asDynamic()["exit"] = value }
    var Tag.childFactory: (ReactElement) -> ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["childFactory"]
        set(value) { props.asDynamic()["childFactory"] = value }

    override fun create(): ReactElement = createElement(type, props, *childList.toTypedArray())
}