@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

external interface MixinGutter

var MixinGutter.paddingLeft: Int
    get() = asDynamic()["paddingLeft"] as Int
    set(value) { asDynamic()["paddingLeft"] = value }
var MixinGutter.paddingRight: Int
    get() = asDynamic()["paddingRight"] as Int
    set(value) { asDynamic()["paddingRight"] = value }

inline operator fun MixinGutter.get(key: String): MixinGutter = asDynamic()[key] as MixinGutter
inline operator fun MixinGutter.set(key: String, value: MixinGutter) {
    asDynamic()[key] = value
}

external interface MixinToolbar

var MixinToolbar.minHeight: Int
    get() = asDynamic()["minHeight"] as Int
    set(value) { asDynamic()["minHeight"] = value }

inline operator fun MixinToolbar.get(key: String): MixinToolbar = asDynamic()[key] as MixinToolbar
inline operator fun MixinToolbar.set(key: String, value: MixinToolbar) {
    asDynamic()[key] = value
}

external interface Mixin

var Mixin.gutters: (Any) -> MixinGutter
    get() = asDynamic()["gutters"] as (Any) -> MixinGutter
    set(value) { asDynamic()["gutters"] = value }

var Mixin.toolbar: MixinToolbar
    get() = asDynamic()["toolbar"] as MixinToolbar
    set(value) { asDynamic()["toolbar"] = value }
