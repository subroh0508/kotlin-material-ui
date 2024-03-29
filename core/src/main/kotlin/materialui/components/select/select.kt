package materialui.components.select

import materialui.Select
import materialui.components.input.InputProps
import materialui.components.select.enums.SelectStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.PropsWithChildren
import react.ReactElement

external interface SelectProps : InputProps {
    var autoWidth: Boolean?
    var displayEmpty: Boolean?
    var IconComponent: dynamic
    var input: ReactElement?
    var MenuProps: PropsWithChildren?
    var multiple: Boolean?
    var native: Boolean?
    var onClose: ((Event) -> Unit)?
    var onOpen: ((Event) -> Unit)?
    var open: Boolean?
    var renderValue: ((dynamic) -> ReactElement)?
    var SelectDisplayProps: PropsWithChildren?
    var variant: String?
}

fun RBuilder.select(vararg classMap: Pair<SelectStyle, String>, block: SelectElementBuilder.() -> Unit) {
    child(selectElement(classMap.toList(), block))
}
internal fun selectElement(
    classMap: List<Pair<SelectStyle, String>> = listOf(),
    block: SelectElementBuilder.() -> Unit
) = SelectElementBuilder(Select, classMap.toList()).apply(block).create()
