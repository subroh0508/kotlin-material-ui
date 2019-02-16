package styles.muitheme

external interface Shape

var Shape.borderRadius: Int
    get() = asDynamic()["borderRadius"] as Int
    set(value) { asDynamic()["borderRadius"] = value }