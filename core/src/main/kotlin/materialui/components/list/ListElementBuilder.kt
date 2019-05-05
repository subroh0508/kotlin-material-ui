package materialui.components.list

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.list.enums.ListStyle
import materialui.components.setValue
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

open class ListElementBuilder<T: Tag, Props: ListProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, Props>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ListStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.dense: Boolean? by materialProps
    var Tag.disablePadding: Boolean? by materialProps
    var Tag.subheader: ReactElement? by materialProps

    fun Tag.subheader(block: RBuilder.() -> Unit) { subheader = buildElement(block) }
}