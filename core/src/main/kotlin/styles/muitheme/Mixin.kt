@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinext.js.jsObject
import styles.muitheme.mixins.MixinGutter
import styles.muitheme.mixins.MixinToolbar

external interface MixinGutterSets

inline operator fun MixinGutterSets.get(key: MixinGutter): Int = asDynamic()[key.toString()] as Int
inline operator fun MixinGutterSets.set(key: MixinGutter, value: Int) {
    asDynamic()[key.toString()] = value
}

inline operator fun MixinGutterSets.get(key: String): MixinGutterSets = asDynamic()[key] as MixinGutterSets
inline operator fun MixinGutterSets.set(key: String, handler: MixinGutterSets.() -> Unit) {
    asDynamic()[key] = get(key).apply(handler)
}

external interface MixinToolbarSets

inline operator fun MixinToolbarSets.get(key: MixinToolbar) = asDynamic()[key.toString()] as Int
inline operator fun MixinToolbarSets.set(key: MixinToolbar, value: Int) {
    asDynamic()[key.toString()] = value
}

inline operator fun MixinToolbarSets.get(key: String): MixinToolbarSets = asDynamic()[key] as MixinToolbarSets
inline operator fun MixinToolbarSets.set(key: String, handler: MixinToolbarSets.() -> Unit) {
    asDynamic()[key] = get(key).apply(handler)
}

external interface Mixin

fun Mixin.gutters(func: (Any, MixinGutterSets) -> MixinGutterSets) {
    asDynamic()["gutters"] = { any: Any -> func(any, defaultGutters) }
}

val Mixin.gutters: (Any) -> MixinGutterSets
    get() = asDynamic()["gutters"] as (Any) -> MixinGutterSets

private val Mixin.defaultGutters: MixinGutterSets
    get() = asDynamic()["gutters"](jsObject { }) as MixinGutterSets

inline fun Mixin.toolbar(handler: MixinToolbarSets.() -> Unit) {
    asDynamic()["toolbar"] = toolbar.apply(handler)
}

val Mixin.toolbar: MixinToolbarSets
    get() = asDynamic()["toolbar"] as MixinToolbarSets
