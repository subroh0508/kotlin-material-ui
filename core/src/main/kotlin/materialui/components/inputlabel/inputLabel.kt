package materialui.components.inputlabel

import kotlinx.html.LABEL
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.formlabel.FormLabelProps
import materialui.components.inputlabel.enums.InputLabelStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/InputLabel")
private external val inputLabelModule: dynamic

external interface InputLabelProps : FormLabelProps {
    var disableAnimation: Boolean?
    var FormLabelClasses: dynamic
    var margin: String?
    var shrink: Boolean?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val inputLabelComponent: RClass<InputLabelProps> = inputLabelModule.default

fun RBuilder.inputLabel(vararg classMap: Pair<InputLabelStyle, String>, block: InputLabelElementBuilder<LABEL>.() -> Unit)
    = child(InputLabelElementBuilder(inputLabelComponent, classMap.toList()) { LABEL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.inputLabel(vararg classMap: Pair<InputLabelStyle, String>, factory: (TagConsumer<Unit>) -> T, block: InputLabelElementBuilder<T>.() -> Unit)
    = child(InputLabelElementBuilder(inputLabelComponent, classMap.toList(), factory).apply(block).create())
