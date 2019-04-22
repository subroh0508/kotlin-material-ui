package materialui.components

import kotlinx.html.A
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlin.reflect.KClass

internal fun <T: Tag> consumers(tag: KClass<T>): (TagConsumer<Unit>) -> T = when (tag) {
    A::class -> { consumer ->
        @Suppress("UNCHECKED_CAST")
        A(mapOf(), consumer) as T
    }
    else -> throw NoSuchElementException(tag.simpleName)
}