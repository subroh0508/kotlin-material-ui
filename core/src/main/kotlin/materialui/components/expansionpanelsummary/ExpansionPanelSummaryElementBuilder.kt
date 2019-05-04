package materialui.components.expansionpanelsummary

import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.*

class ExpansionPanelSummaryElementBuilder<T: Tag> internal constructor(
    type: RClass<ExpansionPanelSummaryProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, ExpansionPanelSummaryProps>(type, classMap, factory) {

    var Tag.expanded: Boolean? by materialProps
    var Tag.expandIcon: ReactElement? by materialProps
    var Tag.IconButtonProps: RProps? by materialProps

    fun Tag.expandIcon(block: RBuilder.() -> Unit) { expandIcon = buildElement(block) }
    fun <P: RProps> Tag.iconButtonProps(block: P.() -> Unit) { IconButtonProps = jsObject(block) }
}