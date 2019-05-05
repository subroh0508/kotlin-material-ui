package materialui.components.radiogroup

import materialui.components.formgroup.FormGroupProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/RadioGroup")
private external val radioGroupModule: dynamic

external interface RadioGroupProps : FormGroupProps {
    var defaultValue: Any?
    var name: String?
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val radioGroupComponent: RClass<RadioGroupProps> = radioGroupModule.default

fun RBuilder.radioGroup(block: RadioGroupElementBuilder.() -> Unit)
    = child(RadioGroupElementBuilder(radioGroupComponent, listOf()).apply(block).create())
