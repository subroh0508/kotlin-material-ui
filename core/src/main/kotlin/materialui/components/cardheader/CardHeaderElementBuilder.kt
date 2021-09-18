package materialui.components.cardheader

import kotlinx.html.P
import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.cardheader.enums.CardHeaderStyle
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.typography.TypographyElementBuilder
import materialui.components.typography.TypographyProps
import materialui.components.typography.typography
import materialui.components.typography.typographyElement
import react.*

class CardHeaderElementBuilder<T: Tag> internal constructor(
    type: ComponentType<CardHeaderProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, CardHeaderProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<CardHeaderStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.action: ReactElement? by materialProps
    var Tag.avatar: ReactElement? by materialProps
    var Tag.disableTypography: Boolean? by materialProps
    var Tag.subheader: ReactElement? by materialProps
    var Tag.subheaderTypographyProps: PropsWithChildren? by materialProps
    var Tag.title: ReactElement? by materialProps
    var Tag.titleTypographyProps: PropsWithChildren? by materialProps

    fun Tag.action(block: RBuilder.() -> Unit) { action = buildElement(block) }
    fun Tag.avatar(block: RBuilder.() -> Unit) { avatar = buildElement(block) }
    fun Tag.subheader(block: RBuilder.() -> Unit) { subheader = buildElement(block) }
    fun Tag.title(block: RBuilder.() -> Unit) { title = buildElement(block) }

    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.subheaderTypographyProps(block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit) {
        subheaderTypographyProps = typographyElement(block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.subheaderTypographyProps(block: TypographyElementBuilder<P, TypographyProps>.() -> Unit) {
        subheaderTypographyProps = typographyElement(p = true, block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.titleTypographyProps(block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit) {
        titleTypographyProps = typographyElement(block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.titleTypographyProps(block: TypographyElementBuilder<P, TypographyProps>.() -> Unit) {
        titleTypographyProps = typographyElement(p = true, block = block).props as PropsWithChildren
    }
}