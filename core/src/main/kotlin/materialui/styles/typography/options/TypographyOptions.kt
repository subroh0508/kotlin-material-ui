package materialui.styles.typography.options

import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.css.CSSBuilder
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

fun TypographyOptions.h1(block: CSSBuilder.() -> Unit) { h1 = Object.assign(h1 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.h2(block: CSSBuilder.() -> Unit) { h2 = Object.assign(h2 ?:jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.h3(block: CSSBuilder.() -> Unit) { h3 = Object.assign(h3 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.h4(block: CSSBuilder.() -> Unit) { h4 = Object.assign(h4 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.h5(block: CSSBuilder.() -> Unit) { h5 = Object.assign(h5 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.h6(block: CSSBuilder.() -> Unit) { h6 = Object.assign(h6 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.subtitle1(block: CSSBuilder.() -> Unit) { subtitle1 = Object.assign(subtitle1 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.subtitle2(block: CSSBuilder.() -> Unit) { subtitle2 = Object.assign(subtitle2 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.body1(block: CSSBuilder.() -> Unit) { body1 = Object.assign(body1 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.body2(block: CSSBuilder.() -> Unit) { body2 = Object.assign(body2 ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.caption(block: CSSBuilder.() -> Unit) { caption = Object.assign(caption ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.button(block: CSSBuilder.() -> Unit) { button = Object.assign(button ?: jsObject(), CSSBuilder().apply(block).toDynamic) }
fun TypographyOptions.overline(block: CSSBuilder.() -> Unit) { overline = Object.assign(overline ?: jsObject (), CSSBuilder().apply(block).toDynamic) }

