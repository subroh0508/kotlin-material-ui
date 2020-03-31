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
fun <Style> makeStyles(options: dynamic = js {  }, block: StylesSet.() -> Unit): () -> Style  =
    makeStyles(
        { theme: MuiTheme -> StylesBuilder(theme).apply(block).toDynamic() },
        options as Any
    ) as () -> Style
