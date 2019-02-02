package components.chip

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Chip")
private external val chipModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val chipComponent: RComponent<RProps, RState> = chipModule.default

fun RBuilder.chip(block: ChipElementBuilder<DIV>.() -> Unit)
    = child(ChipElementBuilder(chipComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.chip(tag: KClass<T>, block: ChipElementBuilder<T>.() -> Unit)
    = child(ChipElementBuilder(chipComponent, tag).apply(block).create())
