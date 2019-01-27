package components.buttonbase

import components.MaterialElementBuilder
import components.buttonbase.enums.ButtonType
import kotlinext.js.jsObject
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RRef
import react.RState

class ButtonBaseElementBuilder internal constructor(
    override var type: RComponent<ButtonBaseProps, RState>,
    props: ButtonBaseProps = jsObject {  }
) : MaterialElementBuilder<ButtonBaseProps>(props),
    ButtonBaseAttributes by AttributesImpl(props) {

    internal class AttributesImpl(private val props: ButtonBaseProps) : ButtonBaseAttributes {
        override var className: String?
            get() = props.className
            set(value) { props.className = value }
        override var buttonRef: RRef
            get() = props.buttonRef
            set(value) { props.buttonRef = value }
        override var centerRipple: Boolean
            get() = props.centerRipple
            set(value) { props.centerRipple = value }
        override var classes: Any
            get() = props.classes
            set(value) { props.classes = value }
        override var component: String
            get() = props.component
            set(value) { props.component = value }
        override var disabled: Boolean
            get() = props.disabled
            set(value) { props.disabled = value }
        override var disableRipple: Boolean
            get() = props.disableRipple
            set(value) { props.disableRipple = value }
        override var disableTouchRipple: Boolean
            get() = props.disableTouchRipple
            set(value) { props.disableTouchRipple = value }
        override var focusRipple: Boolean
            get() = props.focusRipple
            set(value) { props.focusRipple = value }
        override var focusVisibleClassName: String
            get() = props.focusVisibleClassName
            set(value) { props.focusVisibleClassName = value }
        override var onFocusVisible: (Event) -> Unit
            get() = props.onFocusVisible
            set(value) { props.onFocusVisible = value }
        override var touchRippleProps: RProps
            get() = props.touchRippleProps
            set(value) { props.touchRippleProps = value }
        override var buttonType: ButtonType
            get() = ButtonType.valueOf(props.type)
            set(value) { props.type = value.name }
        override var style: String
            get() = props.style
            set(value) { props.style = value }

        override var onBlur: (Event) -> Unit
            get() = props.onBlur
            set(value) { props.onBlur = value }
        override var onFocus: (Event) -> Unit
            get() = props.onFocus
            set(value) { props.onFocus = value }
        override var onKeyDown: (Event) -> Unit
            get() = props.onKeyDown
            set(value) { props.onKeyDown = value }
        override var onKeyUp: (Event) -> Unit
            get() = props.onKeyUp
            set(value) { props.onKeyUp = value }
        override var onMouseDown: (Event) -> Unit
            get() = props.onMouseDown
            set(value) { props.onMouseDown = value }
        override var onMouseLeave: (Event) -> Unit
            get() = props.onMouseLeave
            set(value) { props.onMouseLeave = value }
        override var onMouseUp: (Event) -> Unit
            get() = props.onMouseUp
            set(value) { props.onMouseUp = value }
        override var onTouchEnd: (Event) -> Unit
            get() = props.onTouchEnd
            set(value) { props.onTouchEnd = value }
        override var onTouchMove: (Event) -> Unit
            get() = props.onTouchMove
            set(value) { props.onTouchMove = value }
        override var onTouchStart: (Event) -> Unit
            get() = props.onTouchStart
            set(value) { props.onTouchStart = value }
        override var onContextMenu: (Event) -> Unit
            get() = props.onContextMenu
            set(value) { props.onContextMenu = value }
    }
}