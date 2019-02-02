package components.grid

import components.MaterialElementBuilder
import components.consumers
import components.grid.enums.*
import components.grid.values.GridSpacing
import components.grid.values.GridUnit
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
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["lg"]
        set(value) { setProp("lg", value) }
    var Tag.md: GridUnit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["md"]
        set(value) { setProp("md", value) }
    var Tag.sm: GridUnit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["sm"]
        set(value) { setProp("sm", value) }
    var Tag.spacing: GridSpacing
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["spacing"]
        set(value) { setProp("spacing", value) }
    var Tag.wrap: GridWrap
        get() = GridWrap.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["wrap"])
        set(value) { setProp("wrap", value.toString()) }
    var Tag.xl: GridUnit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["xl"]
        set(value) { setProp("xl", value) }
    var Tag.xs: GridUnit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["xs"]
        set(value) { setProp("xs", value) }
    var Tag.zeroMinWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["zeroMinWidth"]
        set(value) { setProp("zeroMinWidth", value) }
}