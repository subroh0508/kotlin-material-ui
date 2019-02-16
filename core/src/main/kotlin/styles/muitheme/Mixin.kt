@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinext.js.js
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

fun mixinGutters(
    paddingLeft: Int, paddingRight: Int,
    vararg obj: Pair<String, MixinGutterSets>
) = js {
    this["paddingLeft"] = paddingLeft
    this["paddingRight"] = paddingRight
    obj.forEach { o -> this[o.first] = o.second }
} as MixinGutterSets

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

var Mixin.gutters: (Any) -> MixinGutterSets
    get() = asDynamic()["gutters"] as (Any) -> MixinGutterSets
    set(value) { asDynamic()["gutters"] = value }

inline fun Mixin.toolbar(handler: MixinToolbarSets.() -> Unit) {
    asDynamic()["toolbar"] = toolbar.apply(handler)
}

val Mixin.toolbar: MixinToolbarSets
    get() = asDynamic()["toolbar"] as MixinToolbarSets
