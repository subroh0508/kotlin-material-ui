package materialui.components.buttongroup

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonSize
import materialui.components.button.enums.ButtonVariant
import materialui.components.buttongroup.enums.ButtonGroupOrientation
import materialui.components.buttongroup.enums.ButtonGroupStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class ButtonGroupElementBuilder<T: Tag> internal constructor(
    type: RClass<ButtonGroupProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, ButtonGroupProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ButtonGroupStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

  var Tag.color: ButtonColor? by materialProps
  var Tag.disabled: Boolean? by materialProps
  var Tag.disableRipple: Boolean? by materialProps
  var Tag.disableTouchRipple: Boolean? by materialProps
  var Tag.fullWidth: Boolean? by materialProps
  var Tag.orientation: ButtonGroupOrientation? by materialProps
  var Tag.size: ButtonSize? by materialProps
  var Tag.variant: ButtonVariant? by materialProps
}