package components.menu

import components.MaterialElementBuilder
import components.menulist.MenuListProps
import components.paper.PaperProps
import kotlinext.js.jsObject
import org.w3c.dom.events.Event
import react.RComponent
import react.RState
import react.ReactElement
import values.TransitionDuration

class MenuElementBuilder internal constructor(
    override var type: RComponent<MenuProps, RState>,
    override var attrs: MenuProps = jsObject {  }
) : MaterialElementBuilder<MenuProps>(attrs),
    MenuAttributes by AttributesImpl(attrs) {

    internal class AttributesImpl(private val props: MenuProps) : MenuAttributes {
        override var className: String?
            get() = props.className
            set(value) { props.className = value }
        override var anchorEl: ReactElement?
            get() = props.anchorEl
            set(value) { props.anchorEl = value }
        override var classes: Any
            get() = props.classes
            set(value) { props.classes = value }
        override var disableAutoFocusItem: Boolean
            get() = props.disableAutoFocusItem
            set(value) { props.disableAutoFocusItem = value }
        override var menuListProps: MenuListProps
            get() = props.menuListProps
            set(value) { props.menuListProps = value }
        override var onClose: (Event) -> Unit
            get() = props.onClose
            set(value) { props.onClose = value }
        override var onEnter: (Event) -> Unit
            get() = props.onEnter
            set(value) { props.onEnter = value }
        override var onEntered: (Event) -> Unit
            get() = props.onEntered
            set(value) { props.onEntered = value }
        override var onEntering: (Event) -> Unit
            get() = props.onEntering
            set(value) { props.onEntering = value }
        override var onExit: (Event) -> Unit
            get() = props.onExit
            set(value) { props.onExit = value }
        override var onExited: (Event) -> Unit
            get() = props.onExited
            set(value) { props.onExited = value }
        override var onExiting: (Event) -> Unit
            get() = props.onExiting
            set(value) { props.onExiting = value }
        override var open: Boolean
            get() = props.open
            set(value) { props.open = value }
        override var paperProps: PaperProps
            get() = props.paperProps
            set(value) { props.paperProps = value }
        override var popoverClasses: Any
            get() = props.popoverClasses
            set(value) { props.popoverClasses = value }
        override var theme: Any
            get() = props.theme
            set(value) { props.theme = value }
        override var transitionDuration: TransitionDuration
            get() = when (props.transitionDuration) {
                "auto" -> TransitionDuration.Auto
                is Number -> TransitionDuration.Ms(props.transitionDuration as Double)
                else -> TransitionDuration.EnterExit(
                    enter = @Suppress("UnsafeCastFromDynamic") props.transitionDuration.asDynamic().enter,
                    exit = @Suppress("UnsafeCastFromDynamic") props.transitionDuration.asDynamic().exit
                )
            }
            set(value) { props.transitionDuration = value.value }
        override var style: String
            get() = props.style
            set(value) { props.style = value }
    }
}