package materialui.components.container.enums

@Suppress("EnumEntryName")
enum class ContainerMaxWidth {
    xs, sm, md, lg, xl, `false`;

    companion object {
        internal fun fromDynamic(jsObject: dynamic): Any = when (jsObject) {
            false -> `false`
            else -> valueOf(jsObject as String)
        }
    }
}
