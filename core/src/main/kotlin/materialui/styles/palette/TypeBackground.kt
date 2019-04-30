package materialui.styles.palette

import kotlinx.css.Color
import materialui.styles.ReadOnlyColorDelegate

external interface TypeBackground

val TypeBackground.default: Color by ReadOnlyColorDelegate
val TypeBackground.paper: Color by ReadOnlyColorDelegate