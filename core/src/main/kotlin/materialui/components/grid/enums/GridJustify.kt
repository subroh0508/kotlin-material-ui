package materialui.components.grid.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class GridJustify(override val realValue: String) : AttributeEnum {
    flexStart("flex-start"),
    center("center"),
    flexEnd("flex-end"),
    spaceBetween("space-between"),
    spaceAround("space-around"),
    spaceEvenly("space-evenly");

    override fun toString(): String = realValue
}