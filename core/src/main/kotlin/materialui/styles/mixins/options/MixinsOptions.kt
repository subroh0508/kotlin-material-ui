package materialui.styles.mixins.options

import kotlinx.css.CssBuilder
import materialui.styles.mixins.GutterDelegate
import materialui.styles.mixins.Gutters
import materialui.styles.mixins.ToolbarDelegate

external interface MixinsOptions

var MixinsOptions.gutters: Gutters? by GutterDelegate
var MixinsOptions.toolbar: CssBuilder? by ToolbarDelegate