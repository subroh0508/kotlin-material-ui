package materialui.styles.palette

import kotlinx.css.Color
import materialui.styles.ReadOnlyColorDelegate

external interface TypeAction

val TypeAction.active: Color by ReadOnlyColorDelegate
val TypeAction.hover: Color by ReadOnlyColorDelegate
val TypeAction.hoverOpacity: Color by ReadOnlyColorDelegate
val TypeAction.selected: Color by ReadOnlyColorDelegate
val TypeAction.disabled: Color by ReadOnlyColorDelegate
val TypeAction.disabledBackground: Color by ReadOnlyColorDelegate
