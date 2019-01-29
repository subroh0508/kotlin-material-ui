package components.listitem

import components.listitem.enums.ListItemAlignItem
import components.listitemsecondaryaction.ListItemSecondaryActionProps

interface ListItemAttributes : BaseMaterialAttributes {
    var alignItems: String
    var button: Boolean
    var classes: Any
    var component: String
    var containerComponent: String
    var containerProps: ListItemSecondaryActionProps
    var dense: Boolean
    var disabled: Boolean
    var disableGutters: Boolean
    var divider: Boolean
    var focusVisibleClassName: ListItemAlignItem
    var selected: Boolean
}