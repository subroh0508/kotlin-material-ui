package materialui.styles.transitions

import kotlinx.css.properties.Timing

external interface Easing

val Easing.easeInOut: Timing by ReadOnlyEasingDelegate
val Easing.easeOut: Timing by ReadOnlyEasingDelegate
val Easing.easeIn: Timing by ReadOnlyEasingDelegate
val Easing.sharp: Timing by ReadOnlyEasingDelegate
