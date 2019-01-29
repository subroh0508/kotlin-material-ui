package values

import components.enums.TransformOriginHorizontal
import components.enums.TransformOriginVertical
import kotlinext.js.js

class TransformOrigin {
    constructor(horizontal: Number, vertical: Number) {
        this.horizontal = horizontal
        this.vertical = vertical
    }
    constructor(horizontal: TransformOriginHorizontal, vertical: Number) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical
    }
    constructor(horizontal: Number, vertical: TransformOriginVertical) {
        this.horizontal = horizontal
        this.vertical = vertical.toString()
    }
    constructor(horizontal: TransformOriginHorizontal, vertical: TransformOriginVertical) {
        this.horizontal = horizontal.toString()
        this.vertical = vertical.toString()
    }
    internal constructor(jsObject: dynamic) {
        this.horizontal = when (jsObject.horizontal) {
            is String -> TransformOriginHorizontal.valueOf(jsObject.horizontal as String)
            else -> jsObject.horizontal as Number
        }
        this.vertical = when (jsObject.vertical) {
            is String -> TransformOriginVertical.valueOf(jsObject.vertical as String)
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