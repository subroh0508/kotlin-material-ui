package components.list

import kotlinx.html.Tag
import kotlinx.html.UL
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/List")
private external val listModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listComponent: RComponent<RProps, RState> = listModule.default

fun RBuilder.list(block: ListElementBuilder<UL>.() -> Unit)
    = child(ListElementBuilder(listComponent, UL::class) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.list(tag: KClass<T>, block: ListElementBuilder<T>.() -> Unit)
    = child(ListElementBuilder(listComponent, tag).apply(block).create())