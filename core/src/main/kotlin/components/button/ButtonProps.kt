package components.button

import components.button.enums.ButtonColor
import components.buttonbase.ButtonBaseProps

interface ButtonProps : ButtonBaseProps {
    var color: String
    var fullWidth: Boolean
    var href: String
    var mini: Boolean
    var size: String
    var variant: String
}