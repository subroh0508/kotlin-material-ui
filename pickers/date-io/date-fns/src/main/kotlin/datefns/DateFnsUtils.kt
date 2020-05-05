package datefns

import datefns.formats.defaultDateFnsFormats
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
        operator fun invoke(option: DateFnsUtilsOption = jsObject()) = (Object.create(DateFnsUtilsModule.default.prototype) as IUtils<Date, String>).apply {
            locale = option.locale
            formats = Object.assign(jsObject(), defaultDateFnsFormats, option.formats ?: jsObject())
        }
    }
}
