package materialui.components.snackbarcontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.SnackbarContent
import materialui.components.paper.PaperProps
import materialui.components.snackbarcontent.enums.SnackbarContentStyle
import react.RBuilder
import react.ReactElement

external interface SnackbarContentProps : PaperProps {
    var action: ReactElement?
    var message: ReactElement?
}

fun RBuilder.snackbarContent(vararg classMap: Pair<SnackbarContentStyle, String>, block: SnackbarContentElementBuilder<DIV>.() -> Unit)
    = child(SnackbarContentElementBuilder(SnackbarContent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.snackbarContent(vararg classMap: Pair<SnackbarContentStyle, String>, factory: (TagConsumer<Unit>) -> T, block: SnackbarContentElementBuilder<T>.() -> Unit)
    = child(SnackbarContentElementBuilder(SnackbarContent, classMap.toList(), factory).apply(block).create())
