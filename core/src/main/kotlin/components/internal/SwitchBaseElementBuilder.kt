package components.internal

import components.MaterialElementBuilder
import kotlinx.html.SPAN
import kotlinx.html.Tag
import react.*

abstract class SwitchBaseElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<SPAN>(type, { SPAN(mapOf(), it) }) {

    var Tag.autoFocus: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["autoFocus"]
        set(value) { setProp("autoFocus", value) }
    var Tag.checked: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["checked"]
        set(value) { setProp("checked", value) }
    var Tag.checkedIcon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["checkedIcon"]
        set(value) { setProp("checkedIcon", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.defaultChecked: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["defaultChecked"]
        set(value) { setProp("defaultChecked", value) }
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.disableRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableRipple"]
        set(value) { setProp("disableRipple", value) }
    var Tag.icon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["icon"]
        set(value) { setProp("icon", value) }
    var Tag.id: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["id"]
        set(value) { setProp("id", value) }
    var Tag.inputProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputProps"]
        set(value) { setProp("inputProps", value) }
    var Tag.inputRef: RRef
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputRef"]
        set(value) { setProp("inputRef", value) }
    var Tag.muiFormControl: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["muiFormControl"]
        set(value) { setProp("muiFormControl", value) }
    var Tag.name: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["name"]
        set(value) { setProp("name", value) }
    var Tag.readOnly: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["readOnly"]
        set(value) { setProp("readOnly", value) }
    var Tag.required: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["required"]
        set(value) { setProp("required", value) }
    var Tag.tabIndex: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["tabIndex"]
        set(value) { setProp("tabIndex", value) }
    var Tag.type: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["type"]
        set(value) { setProp("type", value) }
    var Tag.value: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["Tag.value"]
        set(value) { setProp("Tag.value", value) }
}