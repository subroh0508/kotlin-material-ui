package materialui.components

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RState
import react.createElement
import react.dom.RDOMBuilder

abstract class MMaterialElementBuilder<T: Tag, Props: StandardProps>(
    val type: RComponent<Props, RState>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : RDOMBuilder<T>(factory) {
    init {
        type.props.classes(classMap)
        type.props.component = attrs.tagName
    }

    var Tag.className: String? by type.props
    var Tag.component: String? by type.props

    override fun create() = createElement(type, props, *childList.toTypedArray())
}
