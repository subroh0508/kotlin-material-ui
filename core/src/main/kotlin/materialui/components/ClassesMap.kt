package materialui.components

import kotlinx.css.CSSBuilder

interface ClassesSet {
    val css: MutableMap<String, CSSBuilder>

    operator fun String.invoke(block: CSSBuilder.() -> Unit): String {
        css[this] = CSSBuilder().apply(block)
        return this
    }

    operator fun Enum<*>.invoke(block: CSSBuilder.() -> Unit): Enum<*> {
        css[this.toString()] = CSSBuilder().apply(block)
        return this
    }
}

internal class ClassesBuilder(
    override val css: MutableMap<String, CSSBuilder> = mutableMapOf()
) : ClassesSet

internal typealias ClassesMap = Map<Enum<*>, String>