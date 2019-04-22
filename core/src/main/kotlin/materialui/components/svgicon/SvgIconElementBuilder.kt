package materialui.components.svgicon

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.svgicon.enums.SvgIconColor
import materialui.components.svgicon.enums.SvgIconFontSize
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class SvgIconElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.color: SvgIconColor
        get() = SvgIconColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.fontSize: SvgIconFontSize
        get() = SvgIconFontSize.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["fontSize"])
        set(value) { setProp("fontSize", value.toString()) }
    var Tag.nativeColor: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["nativeColor"]
        set(value) { setProp("nativeColor", value) }
    var Tag.shapeRendering: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["shapeRendering"]
        set(value) { setProp("shapeRendering", value) }
    var Tag.titleAccess: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["titleAccess"]
        set(value) { setProp("titleAccess", value) }
    var Tag.viewBox: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["viewBox"]
        set(value) { setProp("viewBox", value) }
}