package materialui.styles.mixins.options

import kotlinx.css.CSSBuilder
import materialui.styles.mixins.GutterDelegate
import materialui.styles.mixins.Gutters
import materialui.styles.mixins.ToolbarDelegate

external interface MixinsOptions

var MixinsOptions.gutters: Gutters? by GutterDelegate
var MixinsOptions.toolbar: CSSBuilder? by ToolbarDelegate