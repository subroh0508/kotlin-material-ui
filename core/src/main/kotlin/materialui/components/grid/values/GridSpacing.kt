package materialui.components.grid.values

class GridSpacing(internal val value: Int)

fun gspace(v: Int) = when (v) {
    0, 8, 16, 24, 32, 40 -> GridSpacing(v)
    else -> throw IllegalArgumentException("$v is invalid space")
}