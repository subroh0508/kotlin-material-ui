package components.iconbutton

import components.MaterialElementBuilder
import components.button.enums.ButtonColor
import components.buttonbase.ButtonBaseElementBuilder
import kotlinext.js.jsObject
import react.RComponent
import react.RState

class IconButtonElementBuilder(
    override var type: RComponent<IconButtonProps, RState>,
    override var attrs: IconButtonProps = jsObject {  }
) : MaterialElementBuilder<IconButtonProps>(attrs),
    IconButtonAttributes by AttributesImpl(attrs),
    ButtonBaseAttributes by ButtonBaseElementBuilder.AttributesImpl(attrs){

    internal class AttributesImpl(private val props: IconButtonProps): IconButtonAttributes {
        override var color: ButtonColor
            get() = ButtonColor.valueOf(props.color)
            set(value) { props.color = value.toString() }
    }
}