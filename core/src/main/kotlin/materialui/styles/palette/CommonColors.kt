package materialui.styles.palette

import kotlinx.css.Color
import materialui.styles.ReadOnlyColorDelegate

external interface CommonColors

val CommonColors.black: Color by ReadOnlyColorDelegate
val CommonColors.white: Color by ReadOnlyColorDelegate