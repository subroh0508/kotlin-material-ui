package materialui.components.stepcontent.values

import kotlinext.js.js

class StepContentTransitionDuration {
    constructor(ms: Number) { value = ms }
    constructor(enter: Number, exit: Number) { value = js { this.enter = enter; this.exit = exit } as Any }
    private constructor() { value = "auto" }

    companion object {
        fun auto() = StepContentTransitionDuration()
    }

    internal constructor(jsObject: dynamic) { value = jsObject as Any }

    internal val value: Any
}