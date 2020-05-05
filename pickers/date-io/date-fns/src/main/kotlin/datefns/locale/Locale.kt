package datefns.locale

external interface Locale {
    var code: String?
        get() = definedExternally
        set(value) = definedExternally
    var formatDistance: ((args: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var formatRelative: ((args: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var localize: Localize?
        get() = definedExternally
        set(value) = definedExternally
    var formatLong: FormatLong?
        get() = definedExternally
        set(value) = definedExternally
    var match: Match?
        get() = definedExternally
        set(value) = definedExternally
    var options: Options?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Localize {
    var ordinalNumber: (args: Any) -> Any
    var era: (args: Any) -> Any
    var quarter: (args: Any) -> Any
    var month: (args: Any) -> Any
    var day: (args: Any) -> Any
    var dayPeriod: (args: Any) -> Any
}

external interface FormatLong {
    var date: (args: Any) -> Any
    var time: (args: Any) -> Any
    var dateTime: (args: Any) -> Any
}

external interface Match {
    var ordinalNumber: (args: Any) -> Any
    var era: (args: Any) -> Any
    var quarter: (args: Any) -> Any
    var month: (args: Any) -> Any
    var day: (args: Any) -> Any
    var dayPeriod: (args: Any) -> Any
}

external interface Options {
    var weekStartsOn: Int
    var firstWeekContainsDate: Int
}
