package components.circularprogress.values

class CircularProgressValue {
    constructor(value: Number) { this.value = value }
    constructor(value: String) { this.value = value }

    internal val value: Any

    companion object {
        fun fromDynamic(jsObject: dynamic): CircularProgressValue = when (jsObject as Any) {
            is Number -> CircularProgressValue(jsObject as Number)
            is String -> CircularProgressValue(jsObject as String)
            else -> throw IllegalArgumentException()
        }
    }
}