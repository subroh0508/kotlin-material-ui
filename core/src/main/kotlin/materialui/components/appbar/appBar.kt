package materialui.components.appbar

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/AppBar")
private external val appBarModule: dynamic

external interface AppBarProps : RProps {
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var position: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UnsafeCastFromDynamic")
private val appBarComponent: RComponent<RProps, RState> = appBarModule.default

fun RBuilder.appBar(block: AppBarElementBuilder<DIV>.() -> Unit)
    = child(AppBarElementBuilder(appBarComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.appBar(tag: KClass<T>, block: AppBarElementBuilder<T>.() -> Unit)
    = child(AppBarElementBuilder(appBarComponent, tag).apply(block).create())