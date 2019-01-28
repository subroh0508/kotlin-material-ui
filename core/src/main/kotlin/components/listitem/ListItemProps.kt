package components.listitem

import components.listitemsecondaryaction.ListItemSecondaryActionProps
import styled.StyledProps

interface ListItemProps : StyledProps {
    var alignItems: String
    var button: Boolean
    var classes: Any
    var component: String
    @JsName("ContainerComponent")
    var containerComponent: String
    @JsName("ContainerProps")
    var containerProps: ListItemSecondaryActionProps
    var dense: Boolean
    var disabled: Boolean
    var disableGutters: Boolean
    var divider: Boolean
    var focusVisibleClassName: String
    var selected: Boolean
    var style: String
}