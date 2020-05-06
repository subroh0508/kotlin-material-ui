package materialui.pickers.components.calendar

import kotlinext.js.jsObject
import kotlinx.html.Tag
import materialui.components.iconbutton.IconButtonProps
import materialui.pickers.components.ExportedArrowSwitcherProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RBuilder
import react.buildElement

interface ArrowSwitcherElement {
    var Tag.leftArrowIcon: Any?
    fun Tag.leftArrowIcon(block: RBuilder.() -> Unit)

    var Tag.rightArrowIcon: Any?
    fun Tag.rightArrowIcon(block: RBuilder.() -> Unit)

    var Tag.leftArrowButtonText: String?
    var Tag.rightArrowButtonText: String?

    var Tag.leftArrowButtonProps: IconButtonProps?
    fun Tag.leftArrowButtonProps(block: IconButtonProps.() -> Unit)

    var Tag.rightArrowButtonProps: IconButtonProps?
    fun Tag.rightArrowButtonProps(block: IconButtonProps.() -> Unit)
}

internal class ArrowSwitcherDelegate<P: ExportedArrowSwitcherProps>(props: P) : ArrowSwitcherElement {
    override var Tag.leftArrowIcon: Any? by props
    override fun Tag.leftArrowIcon(block: RBuilder.() -> Unit) { leftArrowIcon = buildElement(block) }

    override var Tag.rightArrowIcon: Any? by props
    override fun Tag.rightArrowIcon(block: RBuilder.() -> Unit) { rightArrowIcon = buildElement(block) }

    override var Tag.leftArrowButtonText: String? by props
    override var Tag.rightArrowButtonText: String? by props

    override var Tag.leftArrowButtonProps: IconButtonProps? by props
    override fun Tag.leftArrowButtonProps(block: IconButtonProps.() -> Unit) { leftArrowButtonProps = jsObject(block) }

    override var Tag.rightArrowButtonProps: IconButtonProps? by props
    override fun Tag.rightArrowButtonProps(block: IconButtonProps.() -> Unit) { rightArrowButtonProps = jsObject(block) }
}
