package components.nativeselect

import components.input.InputElementBuilder
import components.nativeselect.enums.NativeSelectVariant
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class NativeSelectElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : InputElementBuilder(type) {

    var Tag.iconComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["IconComponent"]
        set(value) { setProp("IconComponent", value) }
    var Tag.input: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["input"]
        set(value) { setProp("input", value) }
    var Tag.variant: NativeSelectVariant
        get() = NativeSelectVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}