package materialui.components.nativeselect

import materialui.components.input.InputProps
import materialui.components.nativeselect.enums.NativeSelectStyle
import react.*

@JsModule("@material-ui/core/NativeSelect")
private external val nativeSelectModule: dynamic

external interface NativeSelectProps : InputProps {
    var IconComponent: dynamic
    var input: ReactElement?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val nativeSelectComponent: RClass<NativeSelectProps> = nativeSelectModule.default

fun RBuilder.nativeSelect(vararg classMap: Pair<NativeSelectStyle, String>, block: NativeSelectElementBuilder.() -> Unit)
    = child(NativeSelectElementBuilder(nativeSelectComponent, classMap.toList()).apply(block).create())
