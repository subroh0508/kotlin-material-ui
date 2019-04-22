package materialui.components.grid

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.grid.enums.*
import materialui.components.grid.values.GridSpacing
import materialui.components.grid.values.GridUnit
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class GridElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.alignContent: GridAlignContent
        get() = GridAlignContent.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["alignContent"])
        set(value) { setProp("alignContent", value.toString()) }
    var Tag.alignItems: GridAlignItems
        get() = GridAlignItems.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["alignItems"])
        set(value) { setProp("alignItems", value.toString()) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.container: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["container"]
        set(value) { setProp("container", value) }
    var Tag.direction: GridDirection
        get() = GridDirection.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["direction"])
        set(value) { setProp("direction", value.toString()) }
    var Tag.item: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["item"]
        set(value) { setProp("item", value) }
    var Tag.justify: GridJustify
        get() = GridJustify.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["justify"])
        set(value) { setProp("justify", value.toString()) }
    var Tag.lg: GridUnit
        get() = GridUnit(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["lg"])
        set(value) { setProp("lg", value.value) }
    var Tag.md: GridUnit
        get() = GridUnit(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["md"])
        set(value) { setProp("md", value.value) }
    var Tag.sm: GridUnit
        get() = GridUnit(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["sm"])
        set(value) { setProp("sm", value.value) }
    var Tag.spacing: GridSpacing
        get() = GridSpacing(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["spacing"] as Int)
        set(value) { setProp("spacing", value.value) }
    var Tag.wrap: GridWrap
        get() = GridWrap.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["wrap"])
        set(value) { setProp("wrap", value.toString()) }
    var Tag.xl: GridUnit
        get() = GridUnit(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["xl"])
        set(value) { setProp("xl", value.value) }
    var Tag.xs: GridUnit
        get() = GridUnit(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["xs"])
        set(value) { setProp("xs", value.value) }
    var Tag.zeroMinWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["zeroMinWidth"]
        set(value) { setProp("zeroMinWidth", value) }
}