package materialui.components.grid

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.grid.enums.*
import materialui.components.setValue
import react.RClass

class GridElementBuilder<T: Tag> internal constructor(
    type: RClass<GridProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, GridProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<GridStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.alignContent: GridAlignContent? by materialProps
    var Tag.alignItems: GridAlignItems? by materialProps
    var Tag.container: Boolean? by materialProps
    var Tag.direction: GridDirection? by materialProps
    var Tag.item: Boolean? by materialProps
    var Tag.justify: GridJustify? by materialProps
    val Tag.lg: Any? by materialProps
    val Tag.md: Any? by materialProps
    val Tag.sm: Any? by materialProps
    val Tag.spacing: Int? by materialProps
    var Tag.wrap: GridWrap? by materialProps
    val Tag.xl: Any? by materialProps
    val Tag.xs: Any? by materialProps
    var Tag.zeroMinWidth: Boolean? by materialProps

    fun Tag.lg(v: String = "auto") { materialProps.lg = v }
    fun Tag.lg(v: Boolean) { materialProps.lg = v }
    fun Tag.lg(v: Int) { require(v in 1..12); materialProps.lg = v }
    fun Tag.md(v: String = "auto") { materialProps.md = v }
    fun Tag.md(v: Boolean) { materialProps.md = v }
    fun Tag.md(v: Int) { require(v in 1..12); materialProps.md = v }
    fun Tag.sm(v: String = "auto") { materialProps.sm = v }
    fun Tag.sm(v: Boolean) { materialProps.sm = v }
    fun Tag.sm(v: Int) { require(v in 1..12); materialProps.sm = v }
    fun Tag.spacing(v: Int) { require(listOf(0, 8, 16, 24, 32, 40).contains(v)); materialProps.spacing = v }
    fun Tag.xl(v: String = "auto") { materialProps.xl = v }
    fun Tag.xl(v: Boolean) { materialProps.xl = v }
    fun Tag.xl(v: Int) { require(v in 1..12); materialProps.xl = v }
    fun Tag.xs(v: String = "auto") { materialProps.xs = v }
    fun Tag.xs(v: Boolean) { materialProps.xs = v }
    fun Tag.xs(v: Int) { require(v in 1..12); materialProps.xs = v }
}
