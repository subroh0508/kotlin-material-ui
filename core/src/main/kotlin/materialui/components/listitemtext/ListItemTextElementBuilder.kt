package materialui.components.listitemtext

import kotlinx.html.*
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.listitemtext.enums.ListItemTextStyle
import materialui.components.setValue
import materialui.components.typography.TypographyElementBuilder
import materialui.components.typography.TypographyProps
import materialui.components.typography.typography
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

class ListItemTextElementBuilder internal constructor(
    type: RClass<ListItemTextProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ListItemTextProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<ListItemTextStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disableTypography: Boolean? by materialProps
    var Tag.inset: Boolean? by materialProps
    var Tag.primary: ReactElement? by materialProps
    var Tag.primaryTypographyProps: RProps? by materialProps
    var Tag.secondary: ReactElement? by materialProps
    var Tag.secondaryTypographyProps: RProps? by materialProps
    var Tag.theme: MuiTheme? by materialProps

    fun Tag.primary(block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit) { primary = RBuilder().typography(block = block) }
    fun Tag.primary(p: Boolean, block: TypographyElementBuilder<P, TypographyProps>.() -> Unit) { primary = RBuilder().typography(p = p, block = block) }
    fun <T: Tag> Tag.primary(factory: (TagConsumer<Unit>) -> T, block: TypographyElementBuilder<T, TypographyProps>.() -> Unit) { primary = RBuilder().typography(factory = factory, block = block) }
    fun Tag.primaryTypographyProps(block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit) {
        primaryTypographyProps = RBuilder().typography(block = block).props
    }
    fun Tag.secondary(block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit) { secondary = RBuilder().typography(block = block) }
    fun Tag.secondary(p: Boolean, block: TypographyElementBuilder<P, TypographyProps>.() -> Unit) { secondary = RBuilder().typography(p = p, block = block) }
    fun <T: Tag> Tag.secondary(factory: (TagConsumer<Unit>) -> T, block: TypographyElementBuilder<T, TypographyProps>.() -> Unit) { secondary = RBuilder().typography(factory = factory, block = block) }
    fun Tag.secondaryTypographyProps(block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit) {
        secondaryTypographyProps = RBuilder().typography(block = block).props
    }
}