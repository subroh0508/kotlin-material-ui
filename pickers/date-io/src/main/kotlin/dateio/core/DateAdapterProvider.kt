package dateio.core

external interface DateAdapterProvider {
    var dateAdapter: Any
    var locale: Any?
    var dateLibInstance: Any?
    var dateFormats: DateIOFormats<*>
}
