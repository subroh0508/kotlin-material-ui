package components.textfield

import components.consumers
import components.formcontrol.FormControlElementBuilder
import components.textfield.values.TextFieldValue
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.*
import kotlin.reflect.KClass

class TextFieldElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : FormControlElementBuilder<T>(type, tag, factory) {

    var Tag.autoComplete: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["autoComplete"]
        set(value) { setProp("autoComplete", value) }
    var Tag.autoFocus: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["autoFocus"]
        set(value) { setProp("autoFocus", value) }
    var Tag.defaultValue: TextFieldValue
        get() = TextFieldValue.fromDynamic(props.asDynamic()["defaultValue"])
        set(value) { setProp("defaultValue", value.value) }
    var Tag.FormHelperTextProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["FormHelperTextProps"]
        set(value) { setProp("FormHelperTextProps", value) }
    var Tag.helperText: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["helperText"]
        set(value) { setProp("helperText", value) }
    var Tag.id: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["id"]
        set(value) { setProp("id", value) }
    var Tag.InputLabelProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["InputLabelProps"]
        set(value) { setProp("InputLabelProps", value) }
    var Tag.InputProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["InputProps"]
        set(value) { setProp("InputProps", value) }
    var Tag.inputProps: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputProps"]
        set(value) { setProp("inputProps", value) }
    var Tag.inputRef: RRef
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputRef"]
        set(value) { setProp("inputRef", value) }
    var Tag.label: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["label"]
        set(value) { setProp("label", value) }
    var Tag.multiline: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["multiline"]
        set(value) { setProp("multiline", value) }
    var Tag.name: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["name"]
        set(value) { setProp("name", value) }
    var Tag.placeholder: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["placeholder"]
        set(value) { setProp("placeholder", value) }
    var Tag.rows: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rows"]
        set(value) { setProp("rows", value) }
    var Tag.rowsMax: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rowsMax"]
        set(value) { setProp("rowsMax", value) }
    var Tag.select: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["select"]
        set(value) { setProp("select", value) }
    var Tag.SelectProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["SelectProps"]
        set(value) { setProp("SelectProps", value) }
    var Tag.type: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["type"]
        set(value) { setProp("type", value) }
    var Tag.value: TextFieldValue
        get() = TextFieldValue.fromDynamic(props.asDynamic()["value"])
        set(value) { setProp("value", value.toString()) }
}