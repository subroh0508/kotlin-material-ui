package components.button

import components.button.enums.ButtonColor
import components.button.enums.ButtonSize
import components.button.enums.ButtonVariant

interface ButtonAttributes {
    var color: ButtonColor
    var fullWidth: Boolean
    var href: String
    var mini: Boolean
    var size: ButtonSize
    var variant: ButtonVariant
}