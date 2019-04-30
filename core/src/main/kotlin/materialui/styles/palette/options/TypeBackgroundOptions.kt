package materialui.styles.palette.options

import kotlinx.css.Color
import materialui.styles.ColorDelegate

external interface TypeBackgroundOptions

var TypeBackgroundOptions.default: Color? by ColorDelegate
var TypeBackgroundOptions.paper: Color? by ColorDelegate