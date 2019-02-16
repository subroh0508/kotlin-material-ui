package styles.muitheme

external interface Spacing

var Spacing.unit: Int
    get() = asDynamic()["unit"] as Int
    set(value) { asDynamic()["unit"] = value }