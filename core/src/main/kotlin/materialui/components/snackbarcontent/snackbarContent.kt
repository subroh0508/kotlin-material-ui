package materialui.components.snackbarcontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.paper.PaperProps
import materialui.components.snackbarcontent.enums.SnackbarContentStyle
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/SnackbarContent")
private external val snackbarContentModule: dynamic

external interface SnackbarContentProps : PaperProps {
    var action: ReactElement?
    var message: ReactElement?
}

@Suppress("UnsafeCastFromDynamic")
private val snackbarContentComponent: RClass<SnackbarContentProps> = snackbarContentModule.default

fun RBuilder.snackbarContent(vararg classMap: Pair<SnackbarContentStyle, String>, block: SnackbarContentElementBuilder<DIV>.() -> Unit)
    = child(SnackbarContentElementBuilder(snackbarContentComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.snackbarContent(vararg classMap: Pair<SnackbarContentStyle, String>, factory: (TagConsumer<Unit>) -> T, block: SnackbarContentElementBuilder<T>.() -> Unit)
    = child(SnackbarContentElementBuilder(snackbarContentComponent, classMap.toList(), factory).apply(block).create())
