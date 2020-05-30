package materialui.components.nativeselect

import materialui.NativeSelect
import materialui.components.input.InputProps
import materialui.components.nativeselect.enums.NativeSelectStyle
import react.*

external interface NativeSelectProps : InputProps {
    var IconComponent: dynamic
    var input: ReactElement?
    var variant: String?
}

fun RBuilder.nativeSelect(vararg classMap: Pair<NativeSelectStyle, String>, block: NativeSelectElementBuilder.() -> Unit)
    = child(NativeSelectElementBuilder(NativeSelect, classMap.toList()).apply(block).create())
