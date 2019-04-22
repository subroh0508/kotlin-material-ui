package materialui.components.popover.values

import materialui.components.popover.enums.PopoverAnchorOriginHorizontal
import materialui.components.popover.enums.PopoverAnchorOriginVertical
import kotlinext.js.js

class PopoverAnchorOrigin {
    constructor(horizontal: Number, vertical: Number) {
        this.horizontal = horizontal
        this.vertical = vertical
    }
    constructor(horizontal: PopoverAnchorOriginHorizontal, vertical: Number) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical
    }
    constructor(horizontal: Number, vertical: PopoverAnchorOriginVertical) {
        this.horizontal = horizontal
        this.vertical = vertical.toString()
    }
    constructor(horizontal: PopoverAnchorOriginHorizontal, vertical: PopoverAnchorOriginVertical) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical.toString()
    }
    internal constructor(jsObject: dynamic) {
        this.horizontal = when (jsObject.horizontal) {
            is String -> PopoverAnchorOriginHorizontal.valueOf(jsObject.horizontal as String)
            else -> jsObject.horizontal as Number
        }
        this.vertical = when (jsObject.vertical) {
            is String -> PopoverAnchorOriginVertical.valueOf(jsObject.vertical as String)
            else -> jsObject.vertical as Number
        }
    }

    private val horizontal: Any
    private val vertical: Any

    internal val value: Any
        get() = js {
            this.horizontal = horizontal
            this.vertical = vertical
        } as Any
}