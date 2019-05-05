package materialui.components.chip

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.chip.enums.ChipColor
import materialui.components.chip.enums.ChipStyle
import materialui.components.chip.enums.ChipVariant
import materialui.components.getValue
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class ChipElementBuilder<T: Tag> internal constructor(
    type: RClass<ChipProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, ChipProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ChipStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.avatar: ReactElement? by materialProps
    var Tag.clickable: Boolean? by materialProps
    var Tag.color: ChipColor? by materialProps
    var Tag.deleteIcon: ReactElement? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.label: ReactElement? by materialProps
    var Tag.onDelete: ((Event) -> Unit)? by materialProps
    val Tag.tabIndex: String? by materialProps
    var Tag.variant: ChipVariant? by materialProps

    fun Tag.avatar(block: RBuilder.() -> Unit) { avatar = buildElement(block) }
    fun Tag.deleteIcon(block: RBuilder.() -> Unit) { deleteIcon = buildElement(block) }
    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun Tag.label(block: RBuilder.() -> Unit) { label = buildElement(block) }
    fun Tag.tabIndex(index: Number) { materialProps.tabIndex = index }
    fun Tag.tabIndex(index: String) { materialProps.tabIndex = index }
}