package materialui.styles

import kotlinext.js.js
import materialui.styles.muitheme.MuiTheme
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/styles/makeStyles")
private external val makeStylesModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val makeStyles: (dynamic, dynamic) -> ((RProps) -> dynamic) = makeStylesModule.default

@Suppress("UNCHECKED_CAST")
fun <Style> makeStyles(options: dynamic = js { }, block: StylesBuilder<RProps>.() -> Unit): () -> Style =
    makeStyles(
        { theme: MuiTheme -> StylesBuilder<RProps>(theme).apply(block).css },
        options as Any
    ) as () -> Style

@Suppress("UNCHECKED_CAST")
fun <Style, P: RProps> makeStyles(options: dynamic = js { }, block: StylesBuilder<P>.() -> Unit): (P) -> Style =
    makeStyles(
        { theme: MuiTheme -> StylesBuilder<P>(theme).apply(block).css },
        options as Any
    ) as (P) -> Style
