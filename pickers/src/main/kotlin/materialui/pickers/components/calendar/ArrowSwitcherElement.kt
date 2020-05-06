package materialui.pickers.components.calendar

import kotlinext.js.jsObject
import materialui.components.iconbutton.IconButtonProps
import materialui.pickers.components.ExportedArrowSwitcherProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RBuilder
import react.RProps
import react.buildElement

interface ArrowSwitcherElement {
    var RProps.leftArrowIcon: Any?
    fun RProps.leftArrowIcon(block: RBuilder.() -> Unit)

    var RProps.rightArrowIcon: Any?
    fun RProps.rightArrowIcon(block: RBuilder.() -> Unit)

    var RProps.leftArrowButtonText: String?
    var RProps.rightArrowButtonText: String?

    var RProps.leftArrowButtonProps: IconButtonProps?
    fun RProps.leftArrowButtonProps(block: IconButtonProps.() -> Unit)

    var RProps.rightArrowButtonProps: IconButtonProps?
    fun RProps.rightArrowButtonProps(block: IconButtonProps.() -> Unit)
}

internal class ArrowSwitcherDelegate<P: ExportedArrowSwitcherProps>(props: P) : ArrowSwitcherElement {
    override var RProps.leftArrowIcon: Any? by props
    override fun RProps.leftArrowIcon(block: RBuilder.() -> Unit) { leftArrowIcon = buildElement(block) }

    override var RProps.rightArrowIcon: Any? by props
    override fun RProps.rightArrowIcon(block: RBuilder.() -> Unit) { rightArrowIcon = buildElement(block) }

    override var RProps.leftArrowButtonText: String? by props
    override var RProps.rightArrowButtonText: String? by props

    override var RProps.leftArrowButtonProps: IconButtonProps? by props
    override fun RProps.leftArrowButtonProps(block: IconButtonProps.() -> Unit) { leftArrowButtonProps = jsObject(block) }

    override var RProps.rightArrowButtonProps: IconButtonProps? by props
    override fun RProps.rightArrowButtonProps(block: IconButtonProps.() -> Unit) { rightArrowButtonProps = jsObject(block) }
}
