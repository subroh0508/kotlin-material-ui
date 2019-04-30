@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.mixins

import kotlinx.css.CSSBuilder

external interface Mixins

val Mixins.gutters: Gutters by ReadOnlyGutterDelegate
val Mixins.toolbar: CSSBuilder by ReadOnlyToolbarDelegate


