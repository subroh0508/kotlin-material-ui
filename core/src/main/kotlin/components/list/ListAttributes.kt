package components.list

import components.BaseMaterialAttributes
import react.ReactElement

interface ListAttributes : BaseMaterialAttributes {
    var classes: Any
    var component: String
    var dense: Boolean
    var disablePadding: Boolean
    var subheader: ReactElement
}