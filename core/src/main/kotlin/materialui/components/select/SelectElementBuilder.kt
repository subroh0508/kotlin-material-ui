package materialui.components.select

import materialui.components.input.InputElementBuilder
import materialui.components.select.enums.SelectVariant
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class SelectElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : InputElementBuilder(type) {

    var Tag.autoWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["autoWidth"]
        set(value) { setProp("autoWidth", value) }
    var Tag.displayEmpty: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["displayEmpty"]
        set(value) { setProp("displayEmpty", value) }
    var Tag.IconComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["IconComponent"]
        set(value) { setProp("IconComponent", value) }
    var Tag.input: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["input"]
        set(value) { setProp("input", value) }
    var Tag.MenuProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["MenuProps"]
        set(value) { setProp("MenuProps", value) }
    var Tag.multiple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["multiple"]
        set(value) { setProp("multiple", value) }
    var Tag.native: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["native"]
        set(value) { setProp("native", value) }
    var Tag.onClose: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onClose"]
        set(value) { setProp("onClose", value) }
    var Tag.onOpen: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onOpen"]
        set(value) { setProp("onOpen", value) }
    var Tag.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { setProp("open", value) }
    var Tag.renderValue: (Any) -> ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["renderValue"]
        set(value) { setProp("renderValue", value) }
    var Tag.SelectDisplayProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["SelectDisplayProps"]
        set(value) { setProp("SelectDisplayProps", value) }
    var Tag.variant: SelectVariant
        get() = SelectVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}