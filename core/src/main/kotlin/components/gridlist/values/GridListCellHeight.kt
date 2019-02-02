package components.gridlist.values

class GridListCellHeight(internal val value: Any)

fun cHeight(v: Number) = GridListCellHeight(v)
fun cHeightAuto() = GridListCellHeight("auto")