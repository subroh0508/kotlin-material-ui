@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinext.js.js
import kotlinx.css.properties.Time
import kotlinx.css.properties.Timing
import kotlinx.css.properties.Transition

external interface TransitionsEasingSets

var TransitionsEasingSets.easeInOut: Timing
    get() = Timing(asDynamic()["easeInOut"] as String)
    set(value) { asDynamic()["easeInOut"] = value.toString() }
var TransitionsEasingSets.easeOut: Timing
    get() = Timing(asDynamic()["easeOut"] as String)
    set(value) { asDynamic()["easeOut"] = value.toString() }
var TransitionsEasingSets.easeIn: Timing
    get() = Timing(asDynamic()["easeIn"] as String)
    set(value) { asDynamic()["easeIn"] = value.toString() }
var TransitionsEasingSets.sharp: Timing
    get() = Timing(asDynamic()["sharp"] as String)
    set(value) { asDynamic()["sharp"] = value.toString() }

external interface TransitionsDurationSets

var TransitionsDurationSets.shortest: Int
    get() = asDynamic()["shortest"] as Int
    set(value) { asDynamic()["shortest"] = value }
var TransitionsDurationSets.shorter: Int
    get() = asDynamic()["shorter"] as Int
    set(value) { asDynamic()["shorter"] = value }
var TransitionsDurationSets.short: Int
    get() = asDynamic()["short"] as Int
    set(value) { asDynamic()["short"] = value }
var TransitionsDurationSets.standard: Int
    get() = asDynamic()["standard"] as Int
    set(value) { asDynamic()["standard"] = value }
var TransitionsDurationSets.complex: Int
    get() = asDynamic()["complex"] as Int
    set(value) { asDynamic()["complex"] = value }
var TransitionsDurationSets.enteringScreen: Int
    get() = asDynamic()["enteringScreen"] as Int
    set(value) { asDynamic()["enteringScreen"] = value }
var TransitionsDurationSets.leavingScreen: Int
    get() = asDynamic()["leavingScreen"] as Int
    set(value) { asDynamic()["leavingScreen"] = value }

external interface Transitions

var Transitions.easing: TransitionsEasingSets
    get() = asDynamic()["easing"] as TransitionsEasingSets
    set(value) { asDynamic()["easing"] = value }

var Transitions.duration: TransitionsDurationSets
    get() = asDynamic()["duration"] as TransitionsDurationSets
    set(value) { asDynamic()["duration"] = value }

var Transitions.create: (List<String>, Any) -> kotlinx.css.properties.Transitions
    get() = { props: List<String>, options: Any ->
        val ts = (asDynamic()["create"](props, options) as String).split(",")

        kotlinx.css.properties.Transitions().also { transitions ->
            ts.forEach { t ->
                val property = """^[a-zA-Z\-]* """.toRegex().find(t)?.value?.let { it.replace(" ", "") }
                val duration = """ \d*ms """.toRegex().find(t)?.value?.let { Time(it.replace(" ", "")) }
                val timing = """cubic-bezier\(.*?\)""".toRegex().find(t)?.value?.let(::Timing)
                val delay = """ \d*ms$""".toRegex().find(t)?.value?.let { Time(it.replace(" ", "")) }

                property ?: return@forEach
                duration ?: return@forEach
                timing ?: return@forEach
                delay ?: return@forEach

                transitions += Transition(property, duration, timing, delay)
            }
        }
    }
    set(value) {
        asDynamic()["create"] = { props: List<String>, options: Any ->
            value(props, options).toString()
        }
    }

inline fun Transitions.create(
    props: List<String>,
    duration: Int? = null,
    easing: Timing? = null,
    delay: Int? = null
) = create(props, js {
    duration?.let { this["duration"] = it }
    easing?.let { this["easing"] = it.toString() }
    delay?.let { this["delay"] = it }
} as Any)

inline fun Transitions.create(
    prop: String = "all",
    duration: Int? = null,
    easing: Timing? = null,
    delay: Int? = null
) = create(listOf(prop), duration, easing, delay)

var Transitions.getAutoHeightDuration: (Number) -> Int
    get() = asDynamic()["getAutoHeightDuration"] as (Number) -> Int
    set(value) { asDynamic()["getAutoHeightDuration"] = value }
