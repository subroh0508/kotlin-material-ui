package components.paper

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Paper")
private external val paperModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val paperComponent: RComponent<RProps, RState> = paperModule.default

fun RBuilder.paper(block: PaperElementBuilder<DIV>.() -> Unit)
    = child(PaperElementBuilder(paperComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.paper(tag: KClass<T>, block: PaperElementBuilder<T>.() -> Unit)
    = child(PaperElementBuilder(paperComponent, tag).apply(block).create())