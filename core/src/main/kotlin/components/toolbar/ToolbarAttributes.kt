package components.toolbar

import components.toolbar.enums.ToolbarVariant

interface ToolbarAttributes : BaseMaterialAttributes {
    var classes: Any
    var disableGutters: Boolean
    var variant: ToolbarVariant
}