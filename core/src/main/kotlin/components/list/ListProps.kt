package components.list

import react.ReactElement
import styled.StyledProps

interface ListProps : StyledProps {
    var classes: Any
    var component: String
    var dense: Boolean
    var disablePadding: Boolean
    var subheader: ReactElement
    var style: String
}