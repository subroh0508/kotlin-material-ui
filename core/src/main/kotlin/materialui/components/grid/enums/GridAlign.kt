package materialui.components.grid.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class GridAlign(override val realValue: String) : AttributeEnum {
    left("left"),
    center("center"),
    right("right");

    override fun toString(): String = realValue
}