package materialui.components.grid.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class GridAlignContent(override val realValue: String) : AttributeEnum {
    stretch("stretch"),
    center("center"),
    flexStart("flex-start"),
    flexEnd("flex-end"),
    spaceBetween("space-between"),
    spaceAround("space-around");

    override fun toString(): String = realValue
}