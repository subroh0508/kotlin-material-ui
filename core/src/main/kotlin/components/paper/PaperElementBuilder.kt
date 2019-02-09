package components.paper

import components.MaterialElementBuilder
import components.MaterialElementStyles
import components.consumers
import components.paper.enums.PaperStyle
import kotlinx.css.CSSBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

open class PaperElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    fun Tag.classes(handler: MaterialElementStyles.() -> Unit) {
        setProp("classes", styles.apply(handler).toDynamic)
    }
    var Tag.elevation: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["elevation"]
        set(value) { setProp("elevation", value) }
    var Tag.square: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["square"]
        set(value) { setProp("square", value) }

    fun MaterialElementStyles.styles(attrName: PaperStyle, handler: CSSBuilder.() -> Unit) {
        this[attrName.toString()] = CSSBuilder().apply(handler).toDynamic
    }
}