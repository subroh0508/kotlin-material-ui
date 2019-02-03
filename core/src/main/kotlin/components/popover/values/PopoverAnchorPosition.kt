package components.popover.values

import kotlinext.js.js

class PopoverAnchorPosition(
    private val left: Number,
    private val top: Number
) {
    internal constructor(jsObject: dynamic) : this(
        jsObject.left as Number,
        jsObject.top as Number
    )

    internal val value: Any = js {
        this.left = left
        this.top = top
    } as Any
}