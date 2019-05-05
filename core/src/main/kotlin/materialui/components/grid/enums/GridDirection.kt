package materialui.components.grid.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class GridDirection(override val realValue: String) : AttributeEnum {
    row("row"),
    rowReverse("row-reverse"),
    column("column"),
    columnReverse("column-reverse");

    override fun toString(): String = realValue
}