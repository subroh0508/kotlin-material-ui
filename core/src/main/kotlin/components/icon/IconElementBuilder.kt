package components.icon

import components.MaterialElementBuilder
import components.icon.enums.IconColor
import components.icon.enums.IconFontSize
import kotlinext.js.jsObject
import react.RComponent
import react.RState
import react.ReactElement
import styled.Styled

class IconElementBuilder internal constructor(
    var iconName: String,
    override var type: RComponent<IconProps, RState>,
    props: IconProps = jsObject {  }
) : MaterialElementBuilder<IconProps>(props),
    IconAttributes by AttributesImpl(props) {

    override fun create(): ReactElement = Styled.createElement(type, css, attrs, childList.apply { add(iconName) })

    internal class AttributesImpl(private val props: IconProps) : IconAttributes {
        override var classes: Any
            get() = props.classes
            set(value) { props.classes = value }
        override var color: IconColor
            get() = IconColor.valueOf(props.color)
            set(value) { props.color = value.name }
        override var component: String
            get() = props.component
            set(value) { props.component = value }
        override var fontSize: IconFontSize
            get() = IconFontSize.valueOf(props.fontSize)
            set(value) { props.fontSize = value.name }
    }
}