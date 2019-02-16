@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinext.js.jsObject

data class MixinGutterSets internal constructor(
    internal val jsObject: dynamic
) {
    var paddingLeft: Int
        get() = jsObject["paddingLeft"] as Int
        set(value) { jsObject["paddingLeft"] = value }
    var paddingRight: Int
        get() = jsObject["paddingRight"] as Int
        set(value) { jsObject["paddingRight"] = value }
}

operator fun MixinGutterSets.get(key: String): MixinGutterSets = MixinGutterSets(jsObject[key])
operator fun MixinGutterSets.set(key: String, handler: MixinGutterSets.() -> Unit) {
    jsObject[key] = MixinGutterSets(jsObject { }).apply(handler)
}

fun mixinGutters(
    paddingLeft: Int, paddingRight: Int,
    vararg obj: Pair<String, MixinGutterSets.() -> Unit>
) = MixinGutterSets(jsObject { }).also {
    it.paddingLeft = paddingLeft
    it.paddingRight = paddingRight
    obj.forEach { o -> it[o.first] = o.second }
}

data class MixinToolbarSets internal constructor(
    internal val jsObject: dynamic
) {
    var minHeight: Int
        get() = jsObject["minHeight"] as Int
        set(value) { jsObject["minHeight"] = value }
}

operator fun MixinToolbarSets.get(key: String): MixinToolbarSets = MixinToolbarSets(jsObject[key])
operator fun MixinToolbarSets.set(key: String, handler: MixinToolbarSets.() -> Unit) {
    jsObject[key] = MixinToolbarSets(jsObject { }).apply(handler)
}

external interface Mixin

var Mixin.gutters: (Any) -> MixinGutterSets
    get() = { any: Any -> MixinGutterSets(asDynamic()["gutters"](any)) }
    set(value) { asDynamic()["gutters"] = { any: Any -> value(any).jsObject } }

fun Mixin.toolbar(handler: MixinToolbarSets.() -> Unit) {
    asDynamic()["toolbar"] = toolbar.apply(handler).jsObject
}

val Mixin.toolbar: MixinToolbarSets
    get() = MixinToolbarSets(asDynamic()["toolbar"])
