package materialui.components.link

import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.link.enums.LinkStyle
import materialui.components.link.enums.LinkUnderline
import materialui.components.setValue
import materialui.components.typography.TypographyElementBuilder
import materialui.components.typography.enums.TypographyStyle
import react.RClass

class LinkElementBuilder<T: Tag> internal constructor(
    type: RClass<LinkProps>,
    classMap: List<Pair<LinkStyle, String>>,
    factory: (TagConsumer<Unit>) -> T
) : TypographyElementBuilder<T, LinkProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<LinkStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.block: Boolean? by materialProps
    var Tag.underline: LinkUnderline? by materialProps

    fun Tag.typographyClasses(vararg classMap: Pair<TypographyStyle, String>) {
        if (classMap.isEmpty()) {
            return
        }

        val classesObj: dynamic = jsObject { }

        classMap.forEach { (key, value) -> classesObj[key] = value }

        materialProps.TypographyClasses = classesObj as Any
    }
}