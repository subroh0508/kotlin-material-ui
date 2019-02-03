package components.snackbarcontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/SnackbarContent")
private external val snackbarContentModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val snackbarContentComponent: RComponent<RProps, RState> = snackbarContentModule.default

fun RBuilder.snackbarContent(block: SnackbarContentElementBuilder<DIV>.() -> Unit)
    = child(SnackbarContentElementBuilder(snackbarContentComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.snackbarContent(tag: KClass<T>, block: SnackbarContentElementBuilder<T>.() -> Unit)
    = child(SnackbarContentElementBuilder(snackbarContentComponent, tag).apply(block).create())
