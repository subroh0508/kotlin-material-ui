package materialui.styles.transitions.options

import kotlinx.css.properties.Timing
import materialui.styles.transitions.EasingDelegate

external interface EasingOptions

var EasingOptions.easeInOut: Timing? by EasingDelegate
var EasingOptions.easeOut: Timing? by EasingDelegate
var EasingOptions.easeIn: Timing? by EasingDelegate
var EasingOptions.sharp: Timing? by EasingDelegate
