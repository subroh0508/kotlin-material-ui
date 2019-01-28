package values

import kotlinext.js.js

sealed class TransitionDuration {
    class Ms(sec: Double) : TransitionDuration() {
        override val value: Any = sec
    }

    class EnterExit(enter: Double, exit: Double) : TransitionDuration() {
        override val value: Any = js {
            this.enter = enter
            this.exit = exit
        } as Any
    }

    object Auto : TransitionDuration() {
        override val value: Any = "auto"
    }

    internal abstract val value: Any
}