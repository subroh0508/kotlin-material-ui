package materialui.components.appbar

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.AppBar
import materialui.components.appbar.enums.AppBarStyle
import materialui.components.paper.PaperProps
import react.RBuilder

external interface AppBarProps : PaperProps {
    var color: String?
    var position: String?
}

fun RBuilder.appBar(vararg classMap: Pair<AppBarStyle, String>, block: AppBarElementBuilder<DIV>.() -> Unit)
    = child(AppBarElementBuilder(AppBar, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.appBar(vararg classMap: Pair<AppBarStyle, String>, factory: (TagConsumer<Unit>) -> T, block: AppBarElementBuilder<T>.() -> Unit)
    = child(AppBarElementBuilder(AppBar, classMap.toList(), factory).apply(block).create())
