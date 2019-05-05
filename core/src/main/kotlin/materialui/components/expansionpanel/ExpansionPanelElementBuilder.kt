package materialui.components.expansionpanel

import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.expansionpanel.enums.ExpansionPanelStyle
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.RClass
import react.RProps

class ExpansionPanelElementBuilder<T: Tag> internal constructor(
    type: RClass<ExpansionPanelProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, ExpansionPanelProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ExpansionPanelStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.CollapseProps: RProps by materialProps
    var Tag.defaultExpanded: Boolean? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.expanded: Boolean? by materialProps
    var Tag.onChange: ((Event, Boolean) -> Unit)? by materialProps

    fun <P: RProps> Tag.collapseProps(block: P.() -> Unit) { CollapseProps = jsObject(block) }
}