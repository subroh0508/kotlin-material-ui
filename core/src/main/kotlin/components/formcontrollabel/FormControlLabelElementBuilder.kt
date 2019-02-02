package components.formcontrollabel

import components.MaterialElementBuilder
import components.formcontrollabel.enums.FormControlLabelPlacement
import kotlinx.html.LABEL
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.*

class FormControlLabelElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<LABEL>(type, { LABEL(mapOf(), it) }) {

    var Tag.checked: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["checked"]
        set(value) { setProp("checked", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.control: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["control"]
        set(value) { setProp("control", value) }
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.inputRef: RRef
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputRef"]
        set(value) { setProp("inputRef", value) }
    var Tag.label: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["label"]
        set(value) { setProp("label", value) }
    var Tag.labelPlacement: FormControlLabelPlacement
        get() = FormControlLabelPlacement.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["labelPlacement"])
        set(value) { setProp("labelPlacement", value.toString()) }
    var Tag.muiFormControl: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["muiFormControl"]
        set(value) { setProp("muiFormControl", value) }
    var Tag.name: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["name"]
        set(value) { setProp("name", value) }
    var Tag.onChange: (Event, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onChange"]
        set(value) { setProp("onChange", value) }
    var Tag.value: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }
}