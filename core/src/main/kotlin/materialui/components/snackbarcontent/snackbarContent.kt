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

fun RBuilder.snackbarContent(vararg classMap: Pair<SnackbarContentStyle, String>, block: SnackbarContentElementBuilder<DIV>.() -> Unit) {
    child(snackbarContentElement(classMap.toList(), block))
}
fun <T: Tag> RBuilder.snackbarContent(vararg classMap: Pair<SnackbarContentStyle, String>, factory: (TagConsumer<Unit>) -> T, block: SnackbarContentElementBuilder<T>.() -> Unit) {
    child(snackbarContentElement(classMap.toList(), factory, block))
}
internal fun snackbarContentElement(
    classMap: List<Pair<SnackbarContentStyle, String>> = listOf(),
    block: SnackbarContentElementBuilder<DIV>.() -> Unit
) = snackbarContentElement(classMap, { DIV(mapOf(), it) }, block)

internal fun <T: Tag> snackbarContentElement(
    classMap: List<Pair<SnackbarContentStyle, String>> = listOf(),
    factory: (TagConsumer<Unit>) -> T,
    block: SnackbarContentElementBuilder<T>.() -> Unit
) = SnackbarContentElementBuilder(SnackbarContent, classMap, factory).apply(block).create()
