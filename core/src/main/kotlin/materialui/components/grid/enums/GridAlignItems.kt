package materialui.components.grid.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class GridAlignItems(override val realValue: String) : AttributeEnum {
    flexStart("flex-start"),
    center("center"),
    flexEnd("flex-end"),
    stretch("stretch"),
    baseline("baseline");

    override fun toString(): String = realValue
}