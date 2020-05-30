package materialui.styles

import kotlinext.js.js
import materialui.rawMakeStyles
import materialui.styles.muitheme.MuiTheme
import react.*

@Suppress("UNCHECKED_CAST")
fun <Style> makeStyles(options: dynamic = js { }, block: StylesBuilder<RProps>.() -> Unit): () -> Style =
    rawMakeStyles(
        { theme: MuiTheme -> StylesBuilder<RProps>(theme).apply(block).css },
        options as Any
    ) as () -> Style

@Suppress("UNCHECKED_CAST")
fun <Style, P: RProps> makeStyles(options: dynamic = js { }, block: StylesBuilder<P>.() -> Unit): (P) -> Style =
    rawMakeStyles(
        { theme: MuiTheme -> StylesBuilder<P>(theme).apply(block).css },
        options as Any
    ) as (P) -> Style
