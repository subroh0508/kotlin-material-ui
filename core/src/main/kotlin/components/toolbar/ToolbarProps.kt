package components.toolbar

import styled.StyledProps

interface ToolbarProps : StyledProps {
    var classes: Any
    var disableGutters: Boolean
    var variant: String
    var style: String
}