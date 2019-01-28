package components.list

import components.MaterialElementBuilder
import kotlinext.js.jsObject
import react.RComponent
import react.RState
import react.ReactElement

class ListElementBuilder internal constructor(
    override var type: RComponent<ListProps, RState>,
    override var attrs: ListProps = jsObject {  }
) : MaterialElementBuilder<ListProps>(attrs),
    ListAttributes by AttributesImpl(attrs) {

    internal class AttributesImpl(private val props: ListProps) : ListAttributes {
        override var className: String?
            get() = props.className
            set(value) { props.className = value }
        override var classes: Any
            get() = props.classes
            set(value) { props.classes = value }
        override var component: String
            get() = props.component
            set(value) { props.component = value }
        override var dense: Boolean
            get() = props.dense
            set(value) { props.dense = value }
        override var disablePadding: Boolean
            get() = props.disablePadding
            set(value) { props.disablePadding = value }
        override var subheader: ReactElement
            get() = props.subheader
            set(value) { props.subheader = value }
        override var style: String
            get() = props.style
            set(value) { props.style = value }
    }
}