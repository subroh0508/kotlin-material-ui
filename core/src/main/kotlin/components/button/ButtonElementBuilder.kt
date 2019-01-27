package components.button

import components.MaterialElementBuilder
import components.button.enums.ButtonColor
import components.button.enums.ButtonSize
import components.button.enums.ButtonVariant
import components.buttonbase.ButtonBaseAttributes
import components.buttonbase.ButtonBaseElementBuilder
import kotlinext.js.jsObject
import react.RComponent
import react.RState
import react.ReactElement
import styled.Styled

class ButtonElementBuilder internal constructor(
    var caption: String = "",
    override var type: RComponent<ButtonProps, RState>,
    override var attrs: ButtonProps = jsObject {  }
) : MaterialElementBuilder<ButtonProps>(attrs),
    ButtonAttributes by AttributesImpl(attrs),
    ButtonBaseAttributes by ButtonBaseElementBuilder.AttributesImpl(attrs) {

    override fun create(): ReactElement = Styled.createElement(type, css, attrs, childList.apply { add(caption) })

    internal class AttributesImpl(private val props: ButtonProps) : ButtonAttributes {
        override var color: ButtonColor
            get() = ButtonColor.valueOf(props.color)
            set(value) { props.color = value.toString() }
        override var fullWidth: Boolean
            get() = props.fullWidth
            set(value) { props.fullWidth = value }
        override var href: String
            get() = props.href
            set(value) { props.href = value }
        override var mini: Boolean
            get() = props.mini
            set(value) { props.mini = value }
        override var size: ButtonSize
            get() = ButtonSize.valueOf(props.size)
            set(value) { props.size = value.toString() }
        override var variant: ButtonVariant
            get() = ButtonVariant.valueOf(props.variant)
            set(value) { props.variant = value.toString() }
    }
}