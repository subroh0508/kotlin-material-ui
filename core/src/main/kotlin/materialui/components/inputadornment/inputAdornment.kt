package materialui.components.inputadornment

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.inputadornment.enums.InputAdornmentStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/InputAdornment")
private external val inputAdornmentModule: dynamic

external interface InputAdornmentProps : StandardProps {
    var disablePointerEvents: Boolean?
    var disableTypography: Boolean?
    var position: String?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val inputAdornmentComponent: RClass<InputAdornmentProps> = inputAdornmentModule.default

fun RBuilder.inputAdornment(vararg classMap: Pair<InputAdornmentStyle, String>, block: InputAdornmentElementBuilder<DIV>.() -> Unit)
    = child(InputAdornmentElementBuilder(inputAdornmentComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.inputAdornment(vararg classMap: Pair<InputAdornmentStyle, String>, factory: (TagConsumer<Unit>) -> T, block: InputAdornmentElementBuilder<T>.() -> Unit)
    = child(InputAdornmentElementBuilder(inputAdornmentComponent, classMap.toList(), factory).apply(block).create())
