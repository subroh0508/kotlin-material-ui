package components.nativeselect

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/NativeSelect")
private external val nativeSelectModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val nativeSelectComponent: RComponent<RProps, RState> = nativeSelectModule.default

fun RBuilder.nativeSelect(block: NativeSelectElementBuilder.() -> Unit)
    = child(NativeSelectElementBuilder(nativeSelectComponent).apply(block).create())
