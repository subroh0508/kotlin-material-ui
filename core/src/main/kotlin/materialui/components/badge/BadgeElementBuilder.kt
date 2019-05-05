package materialui.components.badge

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.badge.enums.BadgeColor
import materialui.components.badge.enums.BadgeStyle
import materialui.components.badge.enums.BadgeVariant
import materialui.components.getValue
import materialui.components.setValue
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class BadgeElementBuilder<T: Tag> internal constructor(
    type: RClass<BadgeProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, BadgeProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<BadgeStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.badgeContent: ReactElement? by materialProps
    var Tag.color: BadgeColor? by materialProps
    var Tag.invisible: Boolean? by materialProps
    var Tag.max: Number? by materialProps
    var Tag.showZero: Boolean? by materialProps
    var Tag.variant: BadgeVariant? by materialProps

    fun Tag.badgeContent(block: RBuilder.() -> Unit) { badgeContent = buildElement(block) }
}