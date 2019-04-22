package materialui.components.outlinedinput

import materialui.components.inputbase.InputBaseElementBuilder
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class OutlinedInputElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : InputBaseElementBuilder(type) {

    var Tag.labelWidth: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["labelWidth"]
        set(value) { setProp("labelWidth", value) }
    var Tag.notched: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["notched"]
        set(value) { setProp("notched", value) }
}