@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import materialui.styles.breakpoint.Breakpoints
import materialui.styles.mixins.Mixins
import materialui.styles.mixins.options.MixinsOptions
import materialui.styles.spacing.Spacing

@JsModule("@material-ui/core/styles/createMixins")
private external val createMixinsModule: dynamic

fun createMixins(breakpoints: Breakpoints, spacing: Spacing, mixins: MixinsOptions): Mixins
    = createMixinsModule.default(breakpoints, spacing, mixins) as Mixins
