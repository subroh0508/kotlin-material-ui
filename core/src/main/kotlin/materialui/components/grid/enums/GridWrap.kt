package materialui.components.grid.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class GridWrap(override val realValue: String) : AttributeEnum {
    nowrap("nowrap"),
    wrap("wrap"),
    wrapReverse("wrap-reverse");

    override fun toString(): String = realValue
}