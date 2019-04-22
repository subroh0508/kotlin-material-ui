package materialui.components.hidden.enums

@Suppress("EnumEntryName")
enum class HiddenWidth {
    xs, sm, md, lg, xl;

    companion object {
        internal fun fromDynamic(jsObject: dynamic): List<HiddenWidth> = when (jsObject as Any) {
            is String -> listOf(valueOf(jsObject as String))
            else -> (jsObject as Array<String>).toList().map { valueOf(it) }
        }
    }
}