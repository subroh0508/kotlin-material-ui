package materialui.styles.palette.options

import kotlinx.css.Color
import materialui.styles.ColorDelegate

external interface TypeTextOptions

var TypeTextOptions.primary: Color? by ColorDelegate
var TypeTextOptions.secondary: Color? by ColorDelegate
var TypeTextOptions.disable: Color? by ColorDelegate
var TypeTextOptions.hint: Color? by ColorDelegate
