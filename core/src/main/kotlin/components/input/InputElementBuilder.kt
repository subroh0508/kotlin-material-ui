package components.input

import components.inputbase.InputBaseElementBuilder
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

open class InputElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : InputBaseElementBuilder(type) {

    var Tag.disableUnderline: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableUnderline"]
        set(value) { setProp("disableUnderline", value) }
}