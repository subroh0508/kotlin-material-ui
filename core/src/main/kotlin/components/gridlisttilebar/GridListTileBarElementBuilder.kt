package components.gridlisttilebar

import components.MaterialElementBuilder
import components.gridlisttilebar.enums.GridListTileBarActionPosition
import components.gridlisttilebar.enums.GridListTileBarTitlePosition
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class GridListTileBarElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.actionIcon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["actionIcon"]
        set(value) { setProp("actionIcon", value) }
    var Tag.actionPosition: GridListTileBarActionPosition
        get() = GridListTileBarActionPosition.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["actionPosition"])
        set(value) { setProp("actionPosition", value.toString()) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.subtitle: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["subtitle"]
        set(value) { setProp("subtitle", value) }
    var Tag.title: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["title"]
        set(value) { setProp("title", value) }
    var Tag.titlePosition: GridListTileBarTitlePosition
        get() = GridListTileBarTitlePosition.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["titlePosition"])
        set(value) { setProp("titlePosition", value.toString()) }
}