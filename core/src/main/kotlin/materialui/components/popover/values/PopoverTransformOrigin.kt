package materialui.components.popover.values

import materialui.components.popover.enums.PopoverTransformOriginHorizontal
import materialui.components.popover.enums.PopoverTransformOriginVertical
import kotlinext.js.js

class PopoverTransformOrigin {
    constructor(horizontal: Number, vertical: Number) {
        this.horizontal = horizontal
        this.vertical = vertical
    }
    constructor(horizontal: PopoverTransformOriginHorizontal, vertical: Number) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical
    }
    constructor(horizontal: Number, vertical: PopoverTransformOriginVertical) {
        this.horizontal = horizontal
        this.vertical = vertical.toString()
    }
    constructor(horizontal: PopoverTransformOriginHorizontal, vertical: PopoverTransformOriginVertical) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical.toString()
    }
    internal constructor(jsObject: dynamic) {
        this.horizontal = when (jsObject.horizontal) {
            is String -> PopoverTransformOriginHorizontal.valueOf(jsObject.horizontal as String)
            else -> jsObject.horizontal as Number
        }
        this.vertical = when (jsObject.vertical) {
            is String -> PopoverTransformOriginVertical.valueOf(jsObject.vertical as String)
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