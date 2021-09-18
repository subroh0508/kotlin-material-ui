package materialui.components.expansionpanelsummary

import kotlinext.js.jsObject
import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.iconbutton.IconButtonElementBuilder
import materialui.components.iconbutton.iconButton
import materialui.components.iconbutton.iconButtonElement
import materialui.components.setValue
import react.*

class ExpansionPanelSummaryElementBuilder<T: Tag> internal constructor(
    type: ComponentType<ExpansionPanelSummaryProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, ExpansionPanelSummaryProps>(type, classMap, factory) {

    var Tag.expanded: Boolean? by materialProps
    var Tag.expandIcon: ReactElement? by materialProps
    var Tag.IconButtonProps: PropsWithChildren? by materialProps

    fun Tag.expandIcon(block: RBuilder.() -> Unit) { expandIcon = buildElement(block) }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.iconButtonProps(block: IconButtonElementBuilder<BUTTON>.() -> Unit) {
        IconButtonProps = iconButtonElement(block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun <T2: Tag> Tag.iconButtonProps(factory: (TagConsumer<Unit>) -> T2, block: IconButtonElementBuilder<T2>.() -> Unit) {
        IconButtonProps = iconButtonElement(factory = factory, block = block).props as PropsWithChildren
    }
    fun <P: PropsWithChildren> Tag.iconButtonProps(block: P.() -> Unit) { IconButtonProps = jsObject(block) }
}