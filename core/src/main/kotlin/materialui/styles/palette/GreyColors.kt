@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.palette

import kotlinx.css.Color

external interface GreyColors

operator fun GreyColors.get(key: GreyType): Color = Color(asDynamic()[key.keyName] as String)
