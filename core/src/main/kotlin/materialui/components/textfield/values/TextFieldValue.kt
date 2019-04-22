package materialui.components.textfield.values

sealed class TextFieldValue(internal val value: Any) {
    class Boolean(value: kotlin.Boolean) : TextFieldValue(value)
    class Number(value: kotlin.Number) : TextFieldValue(value)
    class String(value: kotlin.String) : TextFieldValue(value)
    class BooleanArray(value: List<kotlin.Boolean>) : TextFieldValue(value)
    class NumberArray(value: List<kotlin.Number>) : TextFieldValue(value)
    class StringArray(value: List<kotlin.String>) : TextFieldValue(value)

    companion object {
        internal fun fromDynamic(jsObject: dynamic): TextFieldValue = when (jsObject as Any) {
            is kotlin.Boolean -> Boolean(jsObject as kotlin.Boolean)
            is kotlin.Number -> Number(jsObject as kotlin.Number)
            is kotlin.String -> String(jsObject as kotlin.String)
            is Array<*> -> castList((jsObject as Array<*>).toList())
            else -> throw IllegalArgumentException()
        }

        private fun castList(list: List<*>): TextFieldValue = when {
            list.all { it is kotlin.Boolean } -> TextFieldValue.BooleanArray(list.map { it as kotlin.Boolean })
            list.all { it is kotlin.Number } -> TextFieldValue.NumberArray(list.map { it as kotlin.Number })
            list.all { it is kotlin.String } -> TextFieldValue.StringArray(list.map { it as kotlin.String })
            else -> throw IllegalArgumentException()
        }
    }
}