package materialui.components.popper.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class PopperPlacement(override val realValue: String) : AttributeEnum {
    bottomEnd("bottom-end"),
    bottomStart("bottom-start"),
    bottom("bottom"),
    leftEnd("left-end"),
    leftStart("left-start"),
    left("left"),
    rightEnd("right-end"),
    rightStart("right-start"),
    right("right"),
    topEnd("top-end"),
    topStart("top-start"),
    top("top");

    override fun toString(): String = realValue
}