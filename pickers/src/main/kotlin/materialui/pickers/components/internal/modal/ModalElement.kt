package materialui.pickers.components.internal.modal

import kotlinext.js.jsObject
import materialui.components.dialog.DialogProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RBuilder
import react.RProps
import react.buildElement

interface ModalElement {
    var RProps.okLabel: Any?
    fun RProps.okLabel(block: RBuilder.() -> Unit)

    var RProps.cancelLabel: Any?
    fun RProps.cancelLabel(block: RBuilder.() -> Unit)

    var RProps.clearLabel: Any?
    fun RProps.clearLabel(block: RBuilder.() -> Unit)

    var RProps.todayLabel: Any?
    fun RProps.todayLabel(block: RBuilder.() -> Unit)

    @Suppress("PropertyName")
    var RProps.DialogProps: DialogProps?
    @Suppress("FunctionName")
    fun RProps.DialogProps(block: DialogProps.() -> Unit)

    var RProps.showTodayButton: Boolean?
    var RProps.clearable: Boolean?
    var RProps.showTabs: Boolean?
    var RProps.wider: Boolean?
}

internal class ModalDelegate<P: ModalWrapperProps>(pickerProps: P) : ModalElement {
    override var RProps.okLabel: Any? by pickerProps
    override fun RProps.okLabel(block: RBuilder.() -> Unit) { okLabel = buildElement(block) }

    override var RProps.cancelLabel: Any? by pickerProps
    override fun RProps.cancelLabel(block: RBuilder.() -> Unit) { cancelLabel = buildElement(block) }

    override var RProps.clearLabel: Any? by pickerProps
    override fun RProps.clearLabel(block: RBuilder.() -> Unit) { clearLabel = buildElement(block) }

    override var RProps.todayLabel: Any? by pickerProps
    override fun RProps.todayLabel(block: RBuilder.() -> Unit) { todayLabel = buildElement(block) }

    override var RProps.DialogProps: DialogProps? by pickerProps
    override fun RProps.DialogProps(block: DialogProps.() -> Unit) { DialogProps = jsObject(block) }

    override var RProps.showTodayButton: Boolean? by pickerProps
    override var RProps.clearable: Boolean? by pickerProps
    override var RProps.showTabs: Boolean? by pickerProps
    override var RProps.wider: Boolean? by pickerProps
}
