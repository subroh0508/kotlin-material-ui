package materialui.components.checkbox

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Checkbox")
private external val checkboxModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val checkboxComponent: RComponent<RProps, RState> = checkboxModule.default

fun RBuilder.checkbox(block: CheckboxElementBuilder.() -> Unit)
    = child(CheckboxElementBuilder(checkboxComponent).apply(block).create())
