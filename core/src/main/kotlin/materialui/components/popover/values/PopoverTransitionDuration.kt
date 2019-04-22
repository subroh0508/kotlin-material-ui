package materialui.components.popover.values

import materialui.components.values.duration.HasEnterExit
import materialui.components.values.duration.HasEnterExitImpl
import materialui.components.values.duration.MilliSecond
import materialui.components.values.duration.MilliSecondImpl

sealed class PopoverTransitionDuration {
    class Ms internal constructor(
        private val delegate: MilliSecondImpl
    ) : PopoverTransitionDuration(), MilliSecond by delegate {
        constructor(ms: Number) : this(MilliSecondImpl(ms))

        override val value: Any get() = delegate.value
    }

    class EnterExit internal constructor(
        private val delegate: HasEnterExitImpl
    ): PopoverTransitionDuration(), HasEnterExit by delegate {
        constructor(enter: Double, exit: Double) : this(HasEnterExitImpl(enter, exit))

        override val value: Any get() = delegate.value
    }

    object Auto : PopoverTransitionDuration() {
        override val value: Any = "auto"
    }

    internal abstract val value: Any

    companion object {
        internal fun fromDynamic(jsObject: dynamic): PopoverTransitionDuration = when (jsObject) {
            "auto" -> PopoverTransitionDuration.Auto
            is Number -> @Suppress("UnsafeCastFromDynamic") PopoverTransitionDuration.Ms(jsObject as Number)
            else -> PopoverTransitionDuration.EnterExit(HasEnterExitImpl(jsObject))
        }
    }
}