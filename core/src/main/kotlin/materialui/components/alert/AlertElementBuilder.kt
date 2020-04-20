package materialui.components.alert

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.alert.AlertProps
import materialui.components.alert.enums.AlertVariant
import materialui.components.appbar.enums.AlertSeverity
import materialui.components.appbar.enums.AlertStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class AlertElementBuilder<T : Tag> internal constructor(
    type: RClass<AlertProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, AlertProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<AlertStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.severity: AlertSeverity? by materialProps
    var Tag.variant: AlertVariant? by materialProps
}