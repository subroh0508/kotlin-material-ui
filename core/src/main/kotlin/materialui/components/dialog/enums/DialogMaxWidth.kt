package materialui.components.dialog.enums

@Suppress("EnumEntryName")
enum class DialogMaxWidth {
    xs, sm, md, lg, xl, `false`;

    companion object {
        internal fun fromDynamic(jsObject: dynamic): Any = when (jsObject) {
            false -> DialogMaxWidth.`false`
            else -> DialogMaxWidth.valueOf(jsObject as String)
        }
    }
}