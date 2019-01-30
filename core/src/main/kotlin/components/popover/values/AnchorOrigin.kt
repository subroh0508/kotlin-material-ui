package components.popover.values

import components.popover.enums.AnchorOriginHorizontal
import components.popover.enums.AnchorOriginVertical
import kotlinext.js.js

class AnchorOrigin {
    constructor(horizontal: Number, vertical: Number) {
        this.horizontal = horizontal
        this.vertical = vertical
    }
    constructor(horizontal: AnchorOriginHorizontal, vertical: Number) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical
    }
    constructor(horizontal: Number, vertical: AnchorOriginVertical) {
        this.horizontal = horizontal
        this.vertical = vertical.toString()
    }
    constructor(horizontal: AnchorOriginHorizontal, vertical: AnchorOriginVertical) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical.toString()
    }
    internal constructor(jsObject: dynamic) {
        this.horizontal = when (jsObject.horizontal) {
            is String -> AnchorOriginHorizontal.valueOf(jsObject.horizontal as String)
            else -> jsObject.horizontal as Number
        }
        this.vertical = when (jsObject.vertical) {
            is String -> AnchorOriginVertical.valueOf(jsObject.vertical as String)
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