@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.palette.options

import kotlinx.css.Color
import materialui.styles.palette.GreyType

external interface GreyColorsOptions

fun GreyColorsOptions.get(key: GreyType): Color? = (asDynamic()[key.keyName] as String?)?.let { Color(it) }

fun GreyColorsOptions.set(key: GreyType, color: Color) {
    asDynamic()[key.keyName] = color.toString()
}
