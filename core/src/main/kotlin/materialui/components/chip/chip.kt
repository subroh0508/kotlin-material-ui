package materialui.components.chip

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.chip.enums.ChipStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/Chip")
private external val chipModule: dynamic

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

@Suppress("UnsafeCastFromDynamic")
private val chipComponent: RClass<ChipProps> = chipModule.default

fun RBuilder.chip(vararg classMap: Pair<ChipStyle, String>, block: ChipElementBuilder<DIV>.() -> Unit)
    = child(ChipElementBuilder(chipComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.chip(vararg classMap: Pair<ChipStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ChipElementBuilder<T>.() -> Unit)
    = child(ChipElementBuilder(chipComponent, classMap.toList(), factory).apply(block).create())
