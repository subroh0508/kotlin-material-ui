package materialui.components.grid.values

class GridUnit(internal val value: Any)

fun grid(v: Number) = if (v in 1..12)
                        GridUnit(v)
                      else
                        throw IllegalArgumentException("$v is not out of 1..12")

fun grid(v: Boolean) = GridUnit(v)