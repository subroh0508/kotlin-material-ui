package materialui.components.select

import materialui.components.input.InputProps
import materialui.components.select.enums.SelectStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

@JsModule("@material-ui/core/Select")
private external val selectModule: dynamic

external interface SelectProps : InputProps {
    var autoWidth: Boolean?
    var displayEmpty: Boolean?
    var IconComponent: dynamic
    var input: ReactElement?
    var MenuProps: RProps?
    var multiple: Boolean?
    var native: Boolean?
    var onClose: ((Event) -> Unit)?
    var onOpen: ((Event) -> Unit)?
    var open: Boolean?
    var renderValue: ((dynamic) -> ReactElement)?
    var SelectDisplayProps: RProps?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val selectComponent: RClass<SelectProps> = selectModule.default

fun RBuilder.select(vararg classMap: Pair<SelectStyle, String>, block: SelectElementBuilder.() -> Unit)
    = child(SelectElementBuilder(selectComponent, classMap.toList()).apply(block).create())
