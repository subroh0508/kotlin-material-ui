package components.listitem

import components.MaterialElementBuilder
import components.listitem.enums.ListItemAlignItem
import components.listitemsecondaryaction.ListItemSecondaryActionProps
import kotlinext.js.jsObject
import react.RComponent
import react.RState

class ListItemElementBuilder internal constructor(
    override var type: RComponent<ListItemProps, RState>,
    override var attrs: ListItemProps = jsObject {  }
) : MaterialElementBuilder<ListItemProps>(attrs),
    ListItemAttributes by AttributesImpl(attrs) {

    internal class AttributesImpl(private val props: ListItemProps) : ListItemAttributes {
        override var className: String?
            get() = props.className
            set(value) { props.className = value }
        override var alignItems: String
            get() = props.alignItems
            set(value) { props.alignItems = value }
        override var button: Boolean
            get() = props.button
            set(value) { props.button = value }
        override var classes: Any
            get() = props.classes
            set(value) { props.classes = value }
        override var component: String
            get() = props.component
            set(value) { props.component = value }
        override var containerComponent: String
            get() = props.containerComponent
            set(value) { props.containerComponent = value }
        override var containerProps: ListItemSecondaryActionProps
            get() = props.containerProps
            set(value) { props.containerProps = value }
        override var dense: Boolean
            get() = props.dense
            set(value) { props.dense = value }
        override var disabled: Boolean
            get() = props.disabled
            set(value) { props.disabled = value }
        override var disableGutters: Boolean
            get() = props.disableGutters
            set(value) { props.disableGutters = value }
        override var divider: Boolean
            get() = props.divider
            set(value) { props.divider = value }
        override var focusVisibleClassName: ListItemAlignItem
            get() = ListItemAlignItem.valueOf(props.focusVisibleClassName)
            set(value) { props.focusVisibleClassName = value.value }
        override var selected: Boolean
            get() = props.selected
            set(value) { props.selected = value }
        override var style: String
            get() = props.style
            set(value) { props.style = value }
    }
}