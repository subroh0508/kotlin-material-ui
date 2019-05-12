package materialui.components.tab

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.tab.enums.TabStyle
import materialui.components.tab.enums.TabTextColor
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class TabElementBuilder<T: Tag> internal constructor(
    type: RClass<TabProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, TabProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TabStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.fullWidth: Boolean? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.indicator: ReactElement? by materialProps
    var Tag.label: ReactElement? by materialProps
    var Tag.selected: Boolean? by materialProps
    var Tag.textColor: TabTextColor? by materialProps
    var Tag.value: Any? by materialProps

    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun Tag.indicator(block: RBuilder.() -> Unit) { indicator = buildElement(block) }
    fun Tag.label(block: RBuilder.() -> Unit) { label = buildElement(block) }
}
