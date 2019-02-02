package components.grid.enums

@Suppress("EnumEntryName")
enum class GridDirection(internal val value: String) {
    row("row"),
    rowReverse("row-reverse"),
    column("column"),
    columnReverse("column-reverse")
}