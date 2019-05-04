package materialui.components.radio

import materialui.components.internal.SwitchBaseProps
import materialui.components.radio.enums.RadioStyle
import materialui.components.radio.values.RadioValue
import react.*

@JsModule("@material-ui/core/Radio")
private external val radioModule: dynamic

external interface RadioProps : SwitchBaseProps {
    var color: String?
}

@Suppress("UnsafeCastFromDynamic")
private val radioComponent: RClass<RadioProps> = radioModule.default

fun RBuilder.radio(vararg classMap: Pair<RadioStyle, String>, block: RadioElementBuilder.() -> Unit)
    = child(RadioElementBuilder(radioComponent, classMap.toList()).apply(block).create())

fun rv(v: String) = RadioValue(v)
fun rv(v: Number) = RadioValue(v)
fun rv(v: Boolean) = RadioValue(v)