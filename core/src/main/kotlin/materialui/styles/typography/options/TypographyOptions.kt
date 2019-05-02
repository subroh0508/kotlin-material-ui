package materialui.styles.typography.options

import kotlinext.js.jsObject

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

fun TypographyOptions.h1(block: TypographyStyleOptions.() -> Unit) { h1 = (h1 ?: jsObject { }).apply(block) }
fun TypographyOptions.h2(block: TypographyStyleOptions.() -> Unit) { h2 = (h2 ?: jsObject { }).apply(block) }
fun TypographyOptions.h3(block: TypographyStyleOptions.() -> Unit) { h3 = (h3 ?: jsObject { }).apply(block) }
fun TypographyOptions.h4(block: TypographyStyleOptions.() -> Unit) { h4 = (h4 ?: jsObject { }).apply(block) }
fun TypographyOptions.h5(block: TypographyStyleOptions.() -> Unit) { h5 = (h5 ?: jsObject { }).apply(block) }
fun TypographyOptions.h6(block: TypographyStyleOptions.() -> Unit) { h6 = (h6 ?: jsObject { }).apply(block) }
fun TypographyOptions.subtitle1(block: TypographyStyleOptions.() -> Unit) { subtitle1 = (subtitle1 ?: jsObject { }).apply(block) }
fun TypographyOptions.subtitle2(block: TypographyStyleOptions.() -> Unit) { subtitle2 = (subtitle2 ?: jsObject { }).apply(block) }
fun TypographyOptions.body1(block: TypographyStyleOptions.() -> Unit) { body1 = (body1 ?: jsObject { }).apply(block) }
fun TypographyOptions.body2(block: TypographyStyleOptions.() -> Unit) { body2 = (body2 ?: jsObject { }).apply(block) }
fun TypographyOptions.caption(block: TypographyStyleOptions.() -> Unit) { caption = (caption ?: jsObject { }).apply(block) }
fun TypographyOptions.button(block: TypographyStyleOptions.() -> Unit) { button = (button ?: jsObject { }).apply(block) }
fun TypographyOptions.overline(block: TypographyStyleOptions.() -> Unit) { overline = (overline ?: jsObject { }).apply(block) }
