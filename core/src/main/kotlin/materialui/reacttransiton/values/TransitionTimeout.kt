package materialui.reacttransiton.values

import materialui.components.values.duration.HasEnterExit
import materialui.components.values.duration.HasEnterExitImpl
import materialui.components.values.duration.MilliSecond
import materialui.components.values.duration.MilliSecondImpl

sealed class TransitionTimeout {
    class Ms internal constructor(
        private val delegate: MilliSecondImpl
    ) : TransitionTimeout(), MilliSecond by delegate {
        constructor(ms: Number) : this(MilliSecondImpl(ms))

        override val value: Any get() = delegate.value
    }
    class EnterExit internal constructor(
        private val delegate: HasEnterExitImpl
    ) : TransitionTimeout(), HasEnterExit by delegate {
        constructor(enter: Number, exit: Number) : this(HasEnterExitImpl(enter, exit))

        override val value: Any get() = delegate.value
    }

    internal abstract val value: Any

    companion object {
        fun fromDynamic(jsObject: dynamic): TransitionTimeout = when (jsObject) {
            is Number -> TransitionTimeout.Ms(@Suppress("UnsafeCastFromDynamic") jsObject as Double)
            else -> TransitionTimeout.EnterExit(HasEnterExitImpl(jsObject))
        }
    }
}