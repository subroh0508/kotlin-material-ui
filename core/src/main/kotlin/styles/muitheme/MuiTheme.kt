@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinext.js.js
import kotlinx.css.Color
import kotlinx.css.Direction
import kotlinx.css.LinearDimension
import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.BoxShadows

data class MuiTheme(
    val breakpoints: Breakpoint,
    var direction: Direction,
    val mixins: Mixin,
    val palette: Palette,
    var shadows: List<BoxShadows>,
    val typography: Typography,
    val shape: Shape,
    val spacing: Spacing,
    val transitions: Transitions,
    val zIndex: ZIndex
) {
    companion object {
        private const val REAL_NUMBER_PATTERN: String = """[+-]?(?:\d+\.?\d*|\.\d+)"""
        private const val RGBA_PATTERN: String = """rgba\(.*?\)"""
        private const val BOX_SHADOWS_PATTERN: String
            = "${REAL_NUMBER_PATTERN}px ${REAL_NUMBER_PATTERN}px ${REAL_NUMBER_PATTERN}px ${REAL_NUMBER_PATTERN}px $RGBA_PATTERN"
    }

    internal constructor(jsObject: dynamic) : this(
        breakpoints = jsObject["breakpoints"] as Breakpoint,
        direction = Direction.valueOf(jsObject["direction"] as String),
        mixins = jsObject["mixins"] as Mixin,
        palette = jsObject["palette"] as Palette,
        shadows = (jsObject["shadows"] as Array<String>).map { shadow ->
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
        },
        typography = jsObject["typography"] as Typography,
        shape = jsObject["shape"] as Shape,
        spacing = jsObject["spacing"] as Spacing,
        transitions = jsObject["transitions"] as Transitions,
        zIndex = jsObject["zIndex"] as ZIndex
    )

    internal val toDynamic: Any = js {
        this.breakpoints = breakpoints.asDynamic()
        this.direction = direction.toString()
        this.mixins = mixins.asDynamic()
        this.palette = palette.asDynamic()
        this.shadows = shadows.map(BoxShadows::toString).asDynamic()
        this.typography = typography.asDynamic()
        this.shape = shape.asDynamic()
        this.spacing = spacing.asDynamic()
        this.transitions = transitions.asDynamic()
        this.zIndex = zIndex.asDynamic()
    } as Any

    fun breakpoints(block: Breakpoint.() -> Unit) = breakpoints.apply(block)
    fun mixins(block: Mixin.() -> Unit) = mixins.apply(block)
    fun palette(block: Palette.() -> Unit) = palette.apply(block)
    fun shadows(vararg boxShadows: Pair<Int, BoxShadows>) {
        val boxShadowMap = boxShadows.toMap()

        shadows = shadows.mapIndexed { index, boxShadow ->
            boxShadowMap[index] ?: boxShadow
        }
    }
    fun typography(block: Typography.() -> Unit) = typography.apply(block)
    fun shape(block: Shape.() -> Unit) = shape.apply(block)
    fun spacing(block: Spacing.() -> Unit) = spacing.apply(block)
    fun transitions(block: Transitions.() -> Unit) = transitions.apply(block)
    fun zIndex(block: ZIndex.() -> Unit) = zIndex.apply(block)
}