package materialui.styles.shadow

import kotlinx.css.Color
import kotlinx.css.LinearDimension
import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.BoxShadows
import kotlin.reflect.KProperty

private const val REAL_NUMBER_PATTERN: String = """[+-]?(?:\d+\.?\d*|\.\d+)"""
private const val RGBA_PATTERN: String = """rgba\(.*?\)"""
private const val BOX_SHADOWS_PATTERN: String
        = "${REAL_NUMBER_PATTERN}px ${REAL_NUMBER_PATTERN}px ${REAL_NUMBER_PATTERN}px ${REAL_NUMBER_PATTERN}px $RGBA_PATTERN"

object ReadOnlyShadowsDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): List<BoxShadows> {
        val shadows = thisRef.asDynamic()[property.name] as Array<String>

        return shadows.map { shadow ->
            if (shadow == "none") {
                return@map BoxShadows.none
            }

            BoxShadows().also { boxShadows ->
                BOX_SHADOWS_PATTERN.toRegex().findAll(shadow).forEach { element ->
                    val elements = element.value.split(" ")

                    boxShadows += BoxShadow(
                        false,
                        LinearDimension(elements[0]),
                        LinearDimension(elements[1]),
                        LinearDimension(elements[2]),
                        LinearDimension(elements[3]),
                        Color(elements[4])
                    )
                }
            }
        }
    }
}

object ShadowsDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): List<BoxShadows>? {
        thisRef.asDynamic()[property.name] as Array<String>? ?: return null

        return ReadOnlyShadowsDelegate.getValue(thisRef, property)
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: List<BoxShadows>?) {
        thisRef.asDynamic()[property.name] = value?.map(BoxShadows::toString)?.toTypedArray()
    }
}
