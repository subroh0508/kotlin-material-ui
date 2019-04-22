package materialui.components.clickawaylistener.values

sealed class ClickAwayListenerTouchEvent(internal val value: Any) {
    @Suppress("ClassName") object onTouchStart : ClickAwayListenerTouchEvent("onTouchStart")
    @Suppress("ClassName") object onTouchEnd : ClickAwayListenerTouchEvent("onTouchEnd")
    @Suppress("ClassName") object `false` : ClickAwayListenerTouchEvent(false)

    companion object {
        internal fun fromDynamic(jsObject: dynamic): ClickAwayListenerTouchEvent = when (jsObject) {
            "onTouchStart" -> onTouchStart
            "onTouchEnd" -> onTouchEnd
            false -> `false`
            else -> throw IllegalArgumentException()
        }
    }
}
