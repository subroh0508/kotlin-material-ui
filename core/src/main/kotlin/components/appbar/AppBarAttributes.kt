package components.appbar

import components.appbar.enums.AppBarColor
import components.appbar.enums.AppBarPosition

interface AppBarAttributes {
    var classes: Any
    var color: AppBarColor
    var position: AppBarPosition
}