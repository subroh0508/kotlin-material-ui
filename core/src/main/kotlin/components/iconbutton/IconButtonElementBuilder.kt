package components.iconbutton

import components.MaterialElementBuilder
import components.button.enums.ButtonColor
import components.buttonbase.ButtonBaseAttributes
import components.buttonbase.ButtonBaseElementBuilder
import kotlinext.js.jsObject
import react.RComponent
import react.RState

class IconButtonElementBuilder(
    override var type: RComponent<IconButtonProps, RState>,
    props: IconButtonProps = jsObject {  }
) : MaterialElementBuilder<IconButtonProps>(props),
    IconButtonAttributes by AttributesImpl(props),
    ButtonBaseAttributes by ButtonBaseElementBuilder.AttributesImpl(props){

    internal class AttributesImpl(private val props: IconButtonProps): IconButtonAttributes {
        override var color: ButtonColor
            get() = ButtonColor.valueOf(props.color)
            set(value) { props.color = value.name }
    }
}