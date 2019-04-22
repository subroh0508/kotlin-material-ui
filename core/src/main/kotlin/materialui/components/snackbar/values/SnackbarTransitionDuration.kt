package materialui.components.snackbar.values

import kotlinext.js.js

class SnackbarTransitionDuration {
    constructor(ms: Number) { value = ms }
    constructor(enter: Number, exit: Number) { value = js { this.enter = enter; this.exit = exit } as Any }

    internal constructor(jsObject: dynamic) { value = jsObject as Any }

    internal val value: Any
}