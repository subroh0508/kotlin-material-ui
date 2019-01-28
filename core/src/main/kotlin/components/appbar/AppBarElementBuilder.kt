package components.appbar

import components.MaterialElementBuilder
import components.appbar.enums.AppBarColor
import components.appbar.enums.AppBarPosition
import kotlinext.js.jsObject
import react.RComponent
import react.RState

class AppBarElementBuilder internal constructor(
    override var type: RComponent<AppBarProps, RState>,
    override var attrs: AppBarProps = jsObject {  }
) : MaterialElementBuilder<AppBarProps>(attrs),
    AppBarAttributes by AttributesImpl(attrs) {

    internal class AttributesImpl(private val props: AppBarProps) : AppBarAttributes {
        override var className: String?
            get() = props.className
            set(value) { props.className = value }
        override var classes: Any
            get() = props.classes
            set(value) { props.classes = value }
        override var color: AppBarColor
            get() = AppBarColor.valueOf(props.color)
            set(value) { props.color = value.toString() }
        override var position: AppBarPosition
            get() = AppBarPosition.valueOf(props.position)
            set(value) { props.position = value.toString() }
        override var style: String
            get() = props.style
            set(value) { props.style = value }
    }
}