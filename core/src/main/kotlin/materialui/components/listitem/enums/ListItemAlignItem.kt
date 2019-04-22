package materialui.components.listitem.enums

@Suppress("EnumEntryName")
enum class ListItemAlignItem(internal val value: String) {
    flexStart("flex-start"), center("center");

    companion object {
        fun value(v: String): ListItemAlignItem
                = values().find { it.value == v } ?: throw IllegalArgumentException("Unknown value: $v")
    }
}