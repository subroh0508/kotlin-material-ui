package styles.muitheme

external interface ZIndex

var ZIndex.mobileStepper: Int
    get() = asDynamic()["mobileStepper"] as Int
    set(value) { asDynamic()["mobileStepper"] = value }

var ZIndex.appBar: Int
    get() = asDynamic()["appBar"] as Int
    set(value) { asDynamic()["appBar"] = value }

var ZIndex.drawer: Int
    get() = asDynamic()["drawer"] as Int
    set(value) { asDynamic()["drawer"] = value }

var ZIndex.modal: Int
    get() = asDynamic()["modal"] as Int
    set(value) { asDynamic()["modal"] = value }

var ZIndex.snackbar: Int
    get() = asDynamic()["snackbar"] as Int
    set(value) { asDynamic()["snackbar"] = value }

var ZIndex.tooltip: Int
    get() = asDynamic()["tooltip"] as Int
    set(value) { asDynamic()["tooltip"] = value }
