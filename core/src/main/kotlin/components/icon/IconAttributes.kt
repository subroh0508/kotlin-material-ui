package components.icon

import components.icon.enums.IconColor
import components.icon.enums.IconFontSize

interface IconAttributes {
    var classes: Any
    var color: IconColor
    var component: String
    var fontSize: IconFontSize
}