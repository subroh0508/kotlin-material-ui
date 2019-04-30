package materialui.styles.palette.options

import kotlinx.css.Color
import materialui.styles.ColorDelegate

external interface TypeActionOptions

var TypeActionOptions.active: Color? by ColorDelegate
var TypeActionOptions.hover: Color? by ColorDelegate
var TypeActionOptions.hoverOpacity: Color? by ColorDelegate
var TypeActionOptions.selected: Color? by ColorDelegate
var TypeActionOptions.disabled: Color? by ColorDelegate
var TypeActionOptions.disabledBackground: Color? by ColorDelegate
