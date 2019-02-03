package components.collapse

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Collapse")
private external val collapseModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val collapseComponent: RComponent<RProps, RState> = collapseModule.default

fun RBuilder.collapse(block: CollapseElementBuilder<DIV>.() -> Unit)
    = child(CollapseElementBuilder(collapseComponent, DIV::class, { DIV(mapOf(), it) }).apply(block).create())

fun <T: Tag> RBuilder.collapse(tag: KClass<T>, block: CollapseElementBuilder<T>.() -> Unit)
    = child(CollapseElementBuilder(collapseComponent, tag).apply(block).create())
