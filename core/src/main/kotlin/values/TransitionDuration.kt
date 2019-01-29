package values

import kotlinext.js.js

sealed class TransitionDuration {
    class Ms(sec: Number) : TransitionDuration() {
        override val value: Any = sec
    }

    class EnterExit(private val enter: Double, private val exit: Double) : TransitionDuration() {
        override val value: Any
            get() = js {
                this.enter = enter
                this.exit = exit
            } as Any
    }

    object Auto : TransitionDuration() {
        override val value: Any = "auto"
    }

    internal abstract val value: Any

    companion object {
        internal fun fromDynamic(jsObject: dynamic): TransitionDuration = when (jsObject) {
            "auto" -> TransitionDuration.Auto
            is Number -> @Suppress("UnsafeCastFromDynamic") TransitionDuration.Ms(jsObject)
            else -> TransitionDuration.EnterExit(
                enter = @Suppress("UnsafeCastFromDynamic") jsObject.enter,
                exit = @Suppress("UnsafeCastFromDynamic") jsObject.exit
            )
        }
    }
}