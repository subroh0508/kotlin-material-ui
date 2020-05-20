package datefns

import datefns.formats.DateFnsDateIOFormats
import datefns.formats.defaultDateFnsFormats
import datefns.locale.Locale
import dateio.core.DateAdapterProvider
import dateio.core.DateIOFormats
import dateio.core.IUtils
import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlin.js.Date

@JsModule("@date-io/date-fns")
external val DateFnsUtilsModule: dynamic

abstract class DateFnsUtils {
    companion object {
        @Suppress("UNCHECKED_CAST", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        operator fun invoke(option: DateFnsUtilsOption = jsObject {}) = (Object.create(DateFnsUtilsModule.default.prototype) as IUtils<Date, String>).apply {
            locale = option.locale
            formats = Object.assign(jsObject {}, defaultDateFnsFormats, option.formats ?: jsObject {})
        }
    }
}

typealias DateFnsAdapter = (DateFnsUtilsOption) -> IUtils<Date, String>

fun DateAdapterProvider.dateFnsAdapter(block: DateFnsAdapter = { options -> DateFnsUtils(options) }) { dateAdapter = block }
fun DateAdapterProvider.locale(locale: Locale) { this.locale = locale }
fun DateAdapterProvider.dateFormats(dateFormats: DateFnsDateIOFormats) { this.dateFormats = dateFormats }
