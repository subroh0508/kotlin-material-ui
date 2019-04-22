package materialui.components.grid

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Grid")
private external val gridModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val gridComponent: RComponent<RProps, RState> = gridModule.default

fun RBuilder.grid(block: GridElementBuilder<DIV>.() -> Unit)
    = child(GridElementBuilder(gridComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.grid(tag: KClass<T>, block: GridElementBuilder<T>.() -> Unit)
    = child(GridElementBuilder(gridComponent, tag).apply(block).create())
