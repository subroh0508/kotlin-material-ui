package components.backdrop.values

import components.values.HasEnterExit
import components.values.HasEnterExitImpl
import components.values.MilliSecond
import components.values.MilliSecondImpl

sealed class TransitionDuration {
    class Ms internal constructor(
        private val delegate: MilliSecondImpl
    ) : TransitionDuration(), MilliSecond by delegate {
        constructor(ms: Number) : this(MilliSecondImpl(ms))

        override val value: Any get() = delegate.value
    }

    class EnterExit internal constructor(
        private val delegate: HasEnterExitImpl
    ) : TransitionDuration(), HasEnterExit by delegate {
        constructor(enter: Number, exit: Number) : this(HasEnterExitImpl(enter, exit))

        override val value: Any get() = delegate.value
    }

    internal abstract val value: Any

    companion object {
        internal fun fromDynamic(jsObject: dynamic): TransitionDuration = when (jsObject) {
            is Number -> @Suppress("UnsafeCastFromDynamic") TransitionDuration.Ms(jsObject as Number)
            else -> EnterExit(HasEnterExitImpl(jsObject))
        }
    }
}