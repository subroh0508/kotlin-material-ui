package materialui.components.chip

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Chip
import materialui.components.StandardProps
import materialui.components.chip.enums.ChipStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.ReactElement

external interface ChipProps : StandardProps {
    var avatar: ReactElement?
    var clickable: Boolean?
    var color: String?
    var deleteIcon: ReactElement?
    var icon: ReactElement?
    var label: ReactElement?
    var onDelete: ((Event) -> Unit)?
    var tabIndex: dynamic
    var variant: String?
}

fun RBuilder.chip(vararg classMap: Pair<ChipStyle, String>, block: ChipElementBuilder<DIV>.() -> Unit) {
    child(ChipElementBuilder(Chip, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.chip(vararg classMap: Pair<ChipStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ChipElementBuilder<T>.() -> Unit) {
    child(ChipElementBuilder(Chip, classMap.toList(), factory).apply(block).create())
}
fun chipElement(
    classMap: List<Pair<ChipStyle, String>> = listOf(),
    block: ChipElementBuilder<DIV>.() -> Unit
) = chipElement(classMap, { DIV(mapOf(), it) }, block)

fun <T: Tag> chipElement(
    classMap: List<Pair<ChipStyle, String>> = listOf(),
    factory: (TagConsumer<Unit>) -> T,
    block: ChipElementBuilder<T>.() -> Unit
) = ChipElementBuilder(Chip, classMap.toList(), factory).apply(block).create()
