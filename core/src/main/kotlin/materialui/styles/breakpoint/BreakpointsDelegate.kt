package materialui.styles.breakpoint

import kotlin.reflect.KProperty

typealias MediaSet = (Any) -> String

object ReadOnlyBreakpointsMediaDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): MediaSet {
        val mediaSet = thisRef.asDynamic()[property.name] as (dynamic) -> String

        return { key -> mediaSet(key) }
    }
}

object BreakpointsMediaDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): MediaSet? {
        val mediaSet = thisRef.asDynamic()[property.name] as ((dynamic) -> String)? ?: return null

        return { key -> mediaSet(key) }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: MediaSet?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
            return
        }

        thisRef.asDynamic()[property.name] = { key -> value(key as Any) }
    }
}

typealias BetweenMediaSet = (String, String) -> String

object ReadOnlyBreakpointsBetweenMediaDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): BetweenMediaSet {
        val betweenMediaSet = thisRef.asDynamic()[property.name] as (String, String) -> String

        return { start, end -> betweenMediaSet(start, end) }
    }
}

object BreakpointsBetweenMediaDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): BetweenMediaSet? {
        val betweenMediaSet = thisRef.asDynamic()[property.name] as ((String, String) -> String)? ?: return null

        return { start, end -> betweenMediaSet(start, end) }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: BetweenMediaSet?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
            return
        }

        thisRef.asDynamic()[property.name] = { start: String, end: String -> value(start, end) }
    }
}

typealias WidthSet = (String) -> Number

object ReadOnlyBreakpointsWidthDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): WidthSet {
        val widthSet = thisRef.asDynamic()[property.name] as (String) -> Number

        return { key -> widthSet(key) }
    }
}

object BreakpointsWidthDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): WidthSet? {
        val widthSet = thisRef.asDynamic()[property.name] as ((String) -> Number)? ?: return null

        return { key -> widthSet(key) }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: WidthSet?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
            return
        }

        thisRef.asDynamic()[property.name] = { key: String -> value(key) }
    }
}
