package materialui.components.alert

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.alert.enums.AlertColor
import materialui.components.alert.enums.AlertSeverity
import materialui.components.alert.enums.AlertStyle
import materialui.components.alert.enums.AlertVariant
import materialui.components.appbar.enums.AppBarStyle
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class AlertElementBuilder<T: Tag> internal constructor(
    type: RClass<AlertProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, AlertProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<AlertStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.action: ReactElement? by materialProps
    var Tag.closeText: String by materialProps
    var Tag.color: AlertColor? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.iconMapping: AlertIconMapping by materialProps
    var Tag.role: String by materialProps
    var Tag.severity: AlertSeverity by materialProps
    var Tag.variant: AlertVariant by materialProps

    fun Tag.action(block: RBuilder.() -> Unit) { action = buildElement(block) }
    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun Tag.iconMapping(block: AlertIconMapping.() -> Unit) { iconMapping.apply(block) }
}
