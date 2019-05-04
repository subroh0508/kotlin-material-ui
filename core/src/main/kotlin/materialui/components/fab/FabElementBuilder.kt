package materialui.components.fab

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonSize
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.fab.enums.FabVariant
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class FabElementBuilder<T: Tag> internal constructor(
    type: RClass<FabProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, FabProps>(type, classMap, factory){

    var Tag.color: ButtonColor? by materialProps
    var Tag.href: String? by materialProps
    var Tag.size: ButtonSize? by materialProps
    var Tag.variant: FabVariant? by materialProps
}