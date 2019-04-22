package materialui.components.inputbase.values

sealed class InputValue(internal val value: Any) {
    class Boolean(value: kotlin.Boolean) : InputValue(value)
    class Number(value: kotlin.Number) : InputValue(value)
    class String(value: kotlin.String) : InputValue(value)
    class Object(value: Any) : InputValue(value)
    class BooleanArray(value: List<kotlin.Boolean>) : InputValue(value)
    class NumberArray(value: List<kotlin.Number>) : InputValue(value)
    class StringArray(value: List<kotlin.String>) : InputValue(value)
    class ObjectArray(value: Any) : InputValue(value)

    companion object {
        internal fun fromDynamic(jsObject: dynamic): InputValue = when (jsObject as Any) {
            is kotlin.Boolean -> Boolean(jsObject as kotlin.Boolean)
            is kotlin.Number -> Number(jsObject as kotlin.Number)
            is kotlin.String -> String(jsObject as kotlin.String)
            is Array<*> -> castList((jsObject as Array<*>).toList())
            else -> Object(jsObject as Any)
        }

        private fun castList(list: List<*>): InputValue = when {
            list.all { it is kotlin.Boolean } -> InputValue.BooleanArray(list.map { it as kotlin.Boolean })
            list.all { it is kotlin.Number } -> InputValue.NumberArray(list.map { it as kotlin.Number })
            list.all { it is kotlin.String } -> InputValue.StringArray(list.map { it as kotlin.String })
            else -> InputValue.ObjectArray(list)
        }
    }
}