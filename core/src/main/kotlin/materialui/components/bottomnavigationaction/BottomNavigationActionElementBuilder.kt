package materialui.components.bottomnavigationaction

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.buttonbase.enums.ButtonBaseStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class BottomNavigationActionElementBuilder<T: Tag> internal constructor(
    type: RClass<BottomNavigationActionProps>,
    classMap: List<Pair<ButtonBaseStyle, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, BottomNavigationActionProps>(type, classMap, factory) {

    var Tag.icon: ReactElement? by materialProps
    var Tag.label: ReactElement? by materialProps
    var Tag.selected: Boolean? by materialProps
    var Tag.showLabel: Boolean? by materialProps
    var Tag.value: Any? by materialProps

    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun Tag.label(block: RBuilder.() -> Unit) { label = buildElement(block) }
}