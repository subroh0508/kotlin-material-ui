package materialui.components.divider

import kotlinx.html.HR
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Divider")
private external val dividerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val dividerComponent: RComponent<RProps, RState> = dividerModule.default

fun RBuilder.divider(block: DividerElementBuilder<HR>.() -> Unit)
    = child(DividerElementBuilder(dividerComponent, HR::class) { HR(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.divider(tag: KClass<T>, block: DividerElementBuilder<T>.() -> Unit)
    = child(DividerElementBuilder(dividerComponent, tag).apply(block).create())
