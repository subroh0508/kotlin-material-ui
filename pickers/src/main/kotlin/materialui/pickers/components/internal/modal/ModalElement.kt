package materialui.pickers.components.internal.modal

import kotlinext.js.jsObject
import kotlinx.html.Tag
import materialui.components.dialog.DialogProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RBuilder
import react.buildElement

interface ModalElement {
    var Tag.okLabel: Any?
    fun Tag.okLabel(block: RBuilder.() -> Unit)

    var Tag.cancelLabel: Any?
    fun Tag.cancelLabel(block: RBuilder.() -> Unit)

    var Tag.clearLabel: Any?
    fun Tag.clearLabel(block: RBuilder.() -> Unit)

    var Tag.todayLabel: Any?
    fun Tag.todayLabel(block: RBuilder.() -> Unit)

    @Suppress("PropertyName")
    var Tag.DialogProps: DialogProps?
    @Suppress("FunctionName")
    fun Tag.DialogProps(block: DialogProps.() -> Unit)

    var Tag.showTodayButton: Boolean?
    var Tag.clearable: Boolean?
    var Tag.showTabs: Boolean?
    var Tag.wider: Boolean?
}

internal class ModalDelegate<P: ModalWrapperProps>(pickerProps: P) : ModalElement {
    override var Tag.okLabel: Any? by pickerProps
    override fun Tag.okLabel(block: RBuilder.() -> Unit) { okLabel = buildElement(block) }

    override var Tag.cancelLabel: Any? by pickerProps
    override fun Tag.cancelLabel(block: RBuilder.() -> Unit) { cancelLabel = buildElement(block) }

    override var Tag.clearLabel: Any? by pickerProps
    override fun Tag.clearLabel(block: RBuilder.() -> Unit) { clearLabel = buildElement(block) }

    override var Tag.todayLabel: Any? by pickerProps
    override fun Tag.todayLabel(block: RBuilder.() -> Unit) { todayLabel = buildElement(block) }

    override var Tag.DialogProps: DialogProps? by pickerProps
    override fun Tag.DialogProps(block: DialogProps.() -> Unit) { DialogProps = jsObject(block) }

    override var Tag.showTodayButton: Boolean? by pickerProps
    override var Tag.clearable: Boolean? by pickerProps
    override var Tag.showTabs: Boolean? by pickerProps
    override var Tag.wider: Boolean? by pickerProps
}
