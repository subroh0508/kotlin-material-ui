package components.typography

import components.MaterialElementBuilder
import components.MaterialElementStyles
import components.consumers
import components.typography.enums.TypographyAlign
import components.typography.enums.TypographyColor
import components.typography.enums.TypographyStyle
import components.typography.enums.TypographyVariant
import components.typography.values.HeadlineMapping
import kotlinx.css.CSSBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

open class TypographyElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory)  {

    var Tag.align: TypographyAlign
        get() = TypographyAlign.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["align"])
        set(value) { setProp("align", value.toString()) }
    fun Tag.classes(handler: MaterialElementStyles.() -> Unit) {
        styles.apply(handler)
    }
    var Tag.color: TypographyColor
        get() = TypographyColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.gutterBottom: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["gutterBottom"]
        set(value) { setProp("gutterBottom", value) }
    var Tag.headlineMapping: HeadlineMapping
        get() = HeadlineMapping.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["headlineMapping"])
        set(value) { setProp("headlineMapping", value.value) }
    var Tag.inline: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inline"]
        set(value) { setProp("inline", value) }
    var Tag.internalDeprecatedVariant: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["internalDeprecatedVariant"]
        set(value) { setProp("internalDeprecatedVariant", value) }
    var Tag.noWrap: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["noWrap"]
        set(value) { setProp("noWrap", value) }
    var Tag.paragraph: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["paragraph"]
        set(value) { setProp("paragraph", value) }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { setProp("theme", value) }
    var Tag.variant: TypographyVariant
        get() = TypographyVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }

    fun MaterialElementStyles.styles(attrName: TypographyStyle, handler: CSSBuilder.() -> Unit) {
        this[attrName.toString()] = CSSBuilder().apply(handler).toDynamic
    }
}