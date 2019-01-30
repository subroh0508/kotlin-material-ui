package components.typography

import kotlinx.html.P
import kotlinx.html.SPAN
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Typography")
private external val typographyModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val typographyComponent: RComponent<RProps, RState> = typographyModule.default

fun RBuilder.typography(block: TypographyElementBuilder<SPAN>.() -> Unit)
    = child(TypographyElementBuilder(typographyComponent, SPAN::class) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.typography(tag: KClass<T>, block: TypographyElementBuilder<T>.() -> Unit)
    = child(TypographyElementBuilder(typographyComponent, tag).apply {
        block()
        if (tag == P::class) {
            setProp("paragraph", true)
        }
    }.create())


