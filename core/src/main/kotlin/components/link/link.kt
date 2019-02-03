package components.link

import kotlinx.html.P
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Link")
private external val linkModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val linkComponent: RComponent<RProps, RState> = linkModule.default

fun RBuilder.link(block: LinkElementBuilder<P>.() -> Unit)
    = child(LinkElementBuilder(linkComponent, P::class) { P(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.link(tag: KClass<T>, block: LinkElementBuilder<T>.() -> Unit)
    = child(LinkElementBuilder(linkComponent, tag).apply(block).create())
