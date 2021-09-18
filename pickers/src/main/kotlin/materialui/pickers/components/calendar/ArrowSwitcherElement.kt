package materialui.pickers.components.calendar

import kotlinext.js.jsObject
import materialui.components.iconbutton.IconButtonProps
import materialui.pickers.components.ExportedArrowSwitcherProps
import react.RBuilder
import react.PropsWithChildren
import react.buildElement

interface ArrowSwitcherElement<P: ExportedArrowSwitcherProps> {
    fun P.leftArrowIcon(block: RBuilder.() -> Unit)
    fun P.rightArrowIcon(block: RBuilder.() -> Unit)

    fun P.leftArrowButtonProps(block: IconButtonProps.() -> Unit)
    fun P.rightArrowButtonProps(block: IconButtonProps.() -> Unit)
}

internal class ArrowSwitcherDelegate<P: ExportedArrowSwitcherProps> : ArrowSwitcherElement<P> {
    override fun P.leftArrowIcon(block: RBuilder.() -> Unit) { leftArrowIcon = buildElement(block) }
    override fun P.rightArrowIcon(block: RBuilder.() -> Unit) { rightArrowIcon = buildElement(block) }

    override fun P.leftArrowButtonProps(block: IconButtonProps.() -> Unit) { leftArrowButtonProps = jsObject(block) }
    override fun P.rightArrowButtonProps(block: IconButtonProps.() -> Unit) { rightArrowButtonProps = jsObject(block) }
}
