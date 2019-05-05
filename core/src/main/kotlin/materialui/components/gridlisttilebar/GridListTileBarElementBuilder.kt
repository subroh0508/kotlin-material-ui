package materialui.components.gridlisttilebar

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.gridlisttilebar.enums.GridListTileBarActionPosition
import materialui.components.gridlisttilebar.enums.GridListTileBarTitlePosition
import materialui.components.gridlisttilebar.enums.GridListTitleBarStyle
import materialui.components.setValue
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class GridListTileBarElementBuilder internal constructor(
    type: RClass<GridListTitleBarProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, GridListTitleBarProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<GridListTitleBarStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.actionIcon: ReactElement? by materialProps
    var Tag.actionPosition: GridListTileBarActionPosition? by materialProps
    var Tag.subtitle: ReactElement? by materialProps
    var Tag.title: ReactElement? by materialProps
    var Tag.titlePosition: GridListTileBarTitlePosition? by materialProps

    fun Tag.actionIcon(block: RBuilder.() -> Unit) { actionIcon = buildElement(block) }
    fun Tag.subtitle(block: RBuilder.() -> Unit) { subtitle = buildElement(block) }
    fun Tag.title(block: RBuilder.() -> Unit) { title = buildElement(block) }
}