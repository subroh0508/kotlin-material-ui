package components.grid.enums

@Suppress("EnumEntryName")
enum class GridJustify(internal val value: String) {
    flexStart("flex-start"),
    center("center"),
    flexEnd("flex-end"),
    spaceBetween("space-between"),
    spaceAround("space-around"),
    spaceEvenly("space-evenly")
}