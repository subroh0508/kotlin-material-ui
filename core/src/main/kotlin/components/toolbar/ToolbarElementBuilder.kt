package components.toolbar

import components.MaterialElementBuilder
import components.toolbar.enums.ToolbarVariant
import kotlinext.js.jsObject
import react.RComponent
import react.RState

class ToolbarElementBuilder internal constructor(
    override var type: RComponent<ToolbarProps, RState>,
    override var attrs: ToolbarProps = jsObject {  }
) : MaterialElementBuilder<ToolbarProps>(attrs),
    ToolbarAttributes by AttributesImpl(attrs) {

    internal class AttributesImpl(private val props: ToolbarProps) : ToolbarAttributes {
        override var className: String?
            get() = props.className
            set(value) { props.className = value }
        override var classes: Any
            get() = props.classes
            set(value) { props.classes = value }
        override var disableGutters: Boolean
            get() = props.disableGutters
            set(value) { props.disableGutters = value }
        override var variant: ToolbarVariant
            get() = ToolbarVariant.valueOf(props.variant)
            set(value) { props.variant = value.toString() }
        override var style: String
            get() = props.style
            set(value) { props.style = value }
    }
}