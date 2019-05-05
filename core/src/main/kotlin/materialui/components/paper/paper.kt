package materialui.components.paper

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.paper.enums.PaperStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Paper")
private external val paperModule: dynamic

external interface PaperProps : StandardProps {
    var elevation: Number?
    var square: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val paperComponent: RClass<PaperProps> = paperModule.default

fun RBuilder.paper(vararg classMap: Pair<PaperStyle, String>, block: PaperElementBuilder<DIV, PaperProps>.() -> Unit)
    = child(PaperElementBuilder(paperComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag, P: PaperProps> RBuilder.paper(vararg classMap: Pair<PaperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: PaperElementBuilder<T, P>.() -> Unit)
    = child(PaperElementBuilder<T, P>(paperComponent, classMap.toList(), factory).apply(block).create())
