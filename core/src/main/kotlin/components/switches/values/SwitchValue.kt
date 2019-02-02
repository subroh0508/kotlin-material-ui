package components.switches.values

class SwitchValue {
    constructor(value: Number) { this.value = value }
    constructor(value: String) { this.value = value }
    constructor(value: Boolean) { this.value = value }

    internal val value: Any

    companion object {
        fun fromDynamic(jsObject: dynamic): SwitchValue = when (jsObject as Any) {
            is Number -> SwitchValue(jsObject as Number)
            is String -> SwitchValue(jsObject as String)
            is Boolean -> SwitchValue(jsObject as Boolean)
            else -> throw IllegalArgumentException()
        }
    }
}