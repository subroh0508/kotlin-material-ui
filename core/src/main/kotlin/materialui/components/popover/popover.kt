package materialui.components.popover

import materialui.components.modal.ModalProps
import materialui.components.popover.enums.PopoverOriginHorizontal
import materialui.components.popover.enums.PopoverOriginVertical
import materialui.components.popover.enums.PopoverReference
import materialui.components.popover.enums.PopoverStyle
import org.w3c.dom.HTMLElement
import org.w3c.dom.Node
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Popover")
private external val popoverModule: dynamic

external interface PopoverProps : ModalProps {
    var action: ((PopoverActions) -> Unit)?
    var anchorEl: dynamic
    var anchorOrigin: PopoverOrigin?
    var anchorPosition: PopoverPosition?
    var anchorReference: PopoverReference?
    var elevation: Number?
    var getContentAnchorEl: ((HTMLElement) -> HTMLElement)?
    var marginThreshold: Number?
    var ModalClasses: Any?
    var onEnter: ((Node) -> Unit)?
    var onEntered: ((Node) -> Unit)?
    var onEntering: ((Node) -> Unit)?
    var onExit: ((Node) -> Unit)?
    var onExited: ((Node) -> Unit)?
    var onExiting: ((Node) -> Unit)?
    var PaperProps: RProps?
    var role: String?
    var transformOrigin: PopoverOrigin?
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: RProps?
}

external interface PopoverActions {
    val updatePosition: () -> Unit
}

external interface PopoverOrigin {
    var horizontal: Any?
    var vertical: Any?
}

fun PopoverOrigin.horizontal(horizontal: PopoverOriginHorizontal) { this.horizontal = horizontal.toString() }
fun PopoverOrigin.horizontal(horizontal: Number) { this.horizontal = horizontal }
fun PopoverOrigin.vertical(vertical: PopoverOriginVertical) { this.vertical = vertical.toString() }
fun PopoverOrigin.vertical(vertical: Number) { this.vertical = vertical }

external interface PopoverPosition {
    var top: Number?
    var left: Number?
}

@Suppress("UnsafeCastFromDynamic")
private val popoverComponent: RClass<PopoverProps> = popoverModule.default

fun RBuilder.popover(vararg classMap: Pair<PopoverStyle, String>, block: PopoverElementBuilder<PopoverProps>.() -> Unit)
    = child(PopoverElementBuilder(popoverComponent, classMap.toList()).apply(block).create())