@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.palette

import kotlinx.css.Color

external interface GreyColors

fun GreyColors.get(n: Int): Color? = (asDynamic()[n] as String?)?.let { Color(it) }

fun GreyColors.set(n: Int, color: Color) {
    asDynamic()[n] = color.toString()
}

fun GreyColors.get(n: String): Color? = (asDynamic()[n.toInt()] as String?)?.let { Color(it) }

fun GreyColors.set(n: String, color: Color) {
    asDynamic()[n.toInt()] = color.toString()
}
