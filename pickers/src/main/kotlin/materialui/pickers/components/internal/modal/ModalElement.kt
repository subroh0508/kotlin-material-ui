package materialui.pickers.components.internal.modal

import kotlinext.js.jsObject
import materialui.components.dialog.DialogProps
import react.RBuilder
import react.buildElement

interface ModalElement<P: ModalWrapperProps> {
    fun P.okLabel(block: RBuilder.() -> Unit)
    fun P.cancelLabel(block: RBuilder.() -> Unit)
    fun P.clearLabel(block: RBuilder.() -> Unit)
    fun P.todayLabel(block: RBuilder.() -> Unit)

    @Suppress("FunctionName")
    fun P.DialogProps(block: DialogProps.() -> Unit)
}

internal class ModalDelegate<P: ModalWrapperProps> : ModalElement<P> {
    override fun P.okLabel(block: RBuilder.() -> Unit) { okLabel = buildElement(block) }
    override fun P.cancelLabel(block: RBuilder.() -> Unit) { cancelLabel = buildElement(block) }
    override fun P.clearLabel(block: RBuilder.() -> Unit) { clearLabel = buildElement(block) }
    override fun P.todayLabel(block: RBuilder.() -> Unit) { todayLabel = buildElement(block) }

    override fun P.DialogProps(block: DialogProps.() -> Unit) { DialogProps = jsObject(block) }
}
