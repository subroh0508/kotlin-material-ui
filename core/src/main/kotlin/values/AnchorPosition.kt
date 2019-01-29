package values

import kotlinext.js.js

class AnchorPosition(
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