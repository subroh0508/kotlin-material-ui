package dateio.core

external interface DateIOFormats<TLibFormatToken> {
    var fullDate: TLibFormatToken
    var normalDate: TLibFormatToken
    var normalDateWithWeekday: TLibFormatToken
    var shortDate: TLibFormatToken
    var year: TLibFormatToken
    var month: TLibFormatToken
    var monthShort: TLibFormatToken
    var monthAndYear: TLibFormatToken
    var monthAndDate: TLibFormatToken
    var dayOfMonth: TLibFormatToken
    var hours12h: TLibFormatToken
    var hours24h: TLibFormatToken
    var minutes: TLibFormatToken
    var seconds: TLibFormatToken
    var fullTime: TLibFormatToken
    var fullTime12h: TLibFormatToken
    var fullTime24h: TLibFormatToken
    var fullDateTime: TLibFormatToken
    var fullDateTime12h: TLibFormatToken
    var fullDateTime24h: TLibFormatToken
    var keyboardDate: TLibFormatToken
    var keyboardDateTime: TLibFormatToken
    var keyboardDateTime12h: TLibFormatToken
    var keyboardDateTime24h: TLibFormatToken
}
