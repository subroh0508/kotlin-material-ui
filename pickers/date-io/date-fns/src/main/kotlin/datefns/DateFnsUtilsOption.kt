package datefns

import datefns.locale.Locale
import dateio.core.DateIOFormats

external interface DateFnsUtilsOption {
    var locale: Locale?
    var formats: DateIOFormats<String>?
}
