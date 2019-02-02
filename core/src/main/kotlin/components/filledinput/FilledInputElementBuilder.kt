package components.filledinput

import components.inputbase.InputBaseElementBuilder
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class FilledInputElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : InputBaseElementBuilder(type) {

    var Tag.disableUnderline: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableUnderline"]
        set(value) { setProp("disableUnderline", value) }
}