package materialui.styles.palette.options

import kotlinx.css.Color
import materialui.styles.ColorDelegate

external interface PaletteColorOptions

var PaletteColorOptions.light: Color? by ColorDelegate
var PaletteColorOptions.main: Color? by ColorDelegate
var PaletteColorOptions.dark: Color? by ColorDelegate
var PaletteColorOptions.contrastText: Color? by ColorDelegate