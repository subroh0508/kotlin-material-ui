package materialui.styles.palette

import kotlinx.css.Color
import materialui.styles.ReadOnlyColorDelegate

external interface PaletteColor

val PaletteColor.light: Color by ReadOnlyColorDelegate
val PaletteColor.main: Color by ReadOnlyColorDelegate
val PaletteColor.dark: Color by ReadOnlyColorDelegate
val PaletteColor.contrastText: Color by ReadOnlyColorDelegate
