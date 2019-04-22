package materialui.components.radio.values

class RadioValue {
    constructor(value: Number) { this.value = value }
    constructor(value: String) { this.value = value }
    constructor(value: Boolean) { this.value = value }

    internal val value: Any

    companion object {
        fun fromDynamic(jsObject: dynamic): RadioValue = when (jsObject as Any) {
            is Number -> RadioValue(jsObject as Number)
            is String -> RadioValue(jsObject as String)
            is Boolean -> RadioValue(jsObject as Boolean)
            else -> throw IllegalArgumentException()
        }
    }
}