package materialui.styles.typography.options

import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.css.CssBuilder
import materialui.styles.toDynamic

external interface TypographyOptions : FontStyleOptions {
    var h1: TypographyStyleOptions?
    var h2: TypographyStyleOptions?
    var h3: TypographyStyleOptions?
    var h4: TypographyStyleOptions?
    var h5: TypographyStyleOptions?
    var h6: TypographyStyleOptions?
    var subtitle1: TypographyStyleOptions?
    var subtitle2: TypographyStyleOptions?
    var body1: TypographyStyleOptions?
    var body2: TypographyStyleOptions?
    var caption: TypographyStyleOptions?
    var button: TypographyStyleOptions?
    var overline: TypographyStyleOptions?
    var pxToRem: ((Number) -> String)?
}

fun TypographyOptions.h1(block: CssBuilder.() -> Unit) { h1 = Object.assign(h1 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.h2(block: CssBuilder.() -> Unit) { h2 = Object.assign(h2 ?:jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.h3(block: CssBuilder.() -> Unit) { h3 = Object.assign(h3 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.h4(block: CssBuilder.() -> Unit) { h4 = Object.assign(h4 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.h5(block: CssBuilder.() -> Unit) { h5 = Object.assign(h5 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.h6(block: CssBuilder.() -> Unit) { h6 = Object.assign(h6 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.subtitle1(block: CssBuilder.() -> Unit) { subtitle1 = Object.assign(subtitle1 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.subtitle2(block: CssBuilder.() -> Unit) { subtitle2 = Object.assign(subtitle2 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.body1(block: CssBuilder.() -> Unit) { body1 = Object.assign(body1 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.body2(block: CssBuilder.() -> Unit) { body2 = Object.assign(body2 ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.caption(block: CssBuilder.() -> Unit) { caption = Object.assign(caption ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.button(block: CssBuilder.() -> Unit) { button = Object.assign(button ?: jsObject(), CssBuilder().apply(block).toDynamic) }
fun TypographyOptions.overline(block: CssBuilder.() -> Unit) { overline = Object.assign(overline ?: jsObject (), CssBuilder().apply(block).toDynamic) }

