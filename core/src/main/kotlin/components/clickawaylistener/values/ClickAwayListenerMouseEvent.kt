package components.clickawaylistener.values

sealed class ClickAwayListenerMouseEvent(internal val value: Any) {
    @Suppress("ClassName") object onClick : ClickAwayListenerMouseEvent("onClick")
    @Suppress("ClassName") object onMouseDown : ClickAwayListenerMouseEvent("onMouseDown")
    @Suppress("ClassName") object onMouseUp : ClickAwayListenerMouseEvent("onMouseUp")
    @Suppress("ClassName") object `false`: ClickAwayListenerMouseEvent(false)

    companion object {
        internal fun fromDynamic(jsObject: dynamic): ClickAwayListenerMouseEvent = when (jsObject) {
            "onClick" -> onClick
            "onMouseDown" -> onMouseDown
            "onMouseUp" -> onMouseUp
            false -> `false`
            else -> throw IllegalArgumentException()
        }
    }
}
