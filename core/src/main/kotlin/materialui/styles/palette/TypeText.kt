package materialui.styles.palette

import kotlinx.css.Color
import materialui.styles.ReadOnlyColorDelegate

external interface TypeText

val TypeText.primary: Color by ReadOnlyColorDelegate
val TypeText.secondary: Color by ReadOnlyColorDelegate
val TypeText.disable: Color by ReadOnlyColorDelegate
val TypeText.hint: Color by ReadOnlyColorDelegate
