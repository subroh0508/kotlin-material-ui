package materialui.components.grid.enums

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class GridStyle(override val realValue: String) : AttributeEnum {
    container("container"),
    item("item"),
    zeroMinWidth("zeroMinWidth"),
    directionXsColumn("direction-xs-column"),
    directionXsColumnReverse("direction-xs-column-reverse"),
    directionXsRowReverse("direction-xs-row-reverse"),
    wrapXsNowrap("wrap-xs-nowrap"),
    wrapXsWrapReverse("wrap-xs-wrap-reverse"),
    alignItemsXsCenter("align-items-xs-center"),
    alignItemsXsFlexStart("align-items-xs-flex-start"),
    alignItemsXsFlexEnd("align-items-xs-flex-end"),
    alignItemsXsBaseline("align-items-xs-baseline"),
    alignContentXsCenter("align-content-xs-center"),
    alignContentXsFlexStart("align-content-xs-flex-start"),
    alignContentXsFlexEnd("align-content-xs-flex-end"),
    alignContentXsSpaceBetween("align-content-xs-space-between"),
    alignContentXsSpaceAround("align-content-xs-space-around"),
    justifyXsCenter("justify-xs-center"),
    justifyXsFlexEnd("justify-xs-flex-end"),
    justifyXsSpaceBetween("justify-xs-space-between"),
    justifyXsSpaceAround("justify-xs-space-around"),
    justifyXsSpaceEvenly("justify-xs-space-evenly"),
    spacingXs8("spacing-xs-8"),
    spacingXs16("spacing-xs-16"),
    spacingXs24("spacing-xs-24"),
    spacingXs32("spacing-xs-32"),
    spacingXs40("spacing-xs-40"),
    gridXsAuto("grid-xs-auto"),
    gridXsTrue("grid-xs-true"),
    gridXs1("grid-xs-1"),
    gridXs2("grid-xs-2"),
    gridXs3("grid-xs-3"),
    gridXs4("grid-xs-4"),
    gridXs5("grid-xs-5"),
    gridXs6("grid-xs-6"),
    gridXs7("grid-xs-7"),
    gridXs8("grid-xs-8"),
    gridXs9("grid-xs-9"),
    gridXs10("grid-xs-10"),
    gridXs11("grid-xs-11"),
    gridXs12("grid-xs-12");

    override fun toString(): String = realValue
}