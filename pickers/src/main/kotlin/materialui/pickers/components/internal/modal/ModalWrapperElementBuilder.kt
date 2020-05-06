package materialui.pickers.components.internal.modal

import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.dialog.DialogProps
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RBuilder
import react.RClass
import react.buildElement

abstract class ModalWrapperElementBuilder<P: ModalWrapperProps> internal constructor(
    type: RClass<P>, className: String?
): BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }) {
    var Tag.okLabel: Any? by pickerProps
    fun Tag.okLabel(block: RBuilder.() -> Unit) { okLabel = buildElement(block) }

    var Tag.cancelLabel: Any? by pickerProps
    fun Tag.cancelLabel(block: RBuilder.() -> Unit) { cancelLabel = buildElement(block) }

    var Tag.clearLabel: Any? by pickerProps
    fun Tag.clearLabel(block: RBuilder.() -> Unit) { clearLabel = buildElement(block) }

    var Tag.todayLabel: Any? by pickerProps
    fun Tag.todayLabel(block: RBuilder.() -> Unit) { todayLabel = buildElement(block) }

    @Suppress("PropertyName")
    var Tag.DialogProps: DialogProps? by pickerProps
    @Suppress("FunctionName")
    fun Tag.DialogProps(block: DialogProps.() -> Unit) { DialogProps = jsObject(block) }

    var Tag.showTodayButton: Boolean? by pickerProps
    var Tag.clearable: Boolean? by pickerProps
    var Tag.showTabs: Boolean? by pickerProps
    var Tag.wider: Boolean? by pickerProps
}
