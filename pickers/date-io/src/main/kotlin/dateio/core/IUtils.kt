@file:JsModule("@date-io/core")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package dateio.core

import kotlin.js.*

external interface IUtils<TDate, TLibFormatToken> {
    var formats: DateIOFormats<TLibFormatToken>
    var locale: Any?
        get() = definedExternally
        set(value) = definedExternally
    var moment: Any?
        get() = definedExternally
        set(value) = definedExternally
    var dayjs: Any?
        get() = definedExternally
        set(value) = definedExternally
    fun date(value: Any = definedExternally): TDate?
    fun toJsDate(value: TDate): Date
    fun parse(value: String, format: String): TDate?
    fun getCurrentLocaleCode(): String
    fun is12HourCycleInCurrentLocale(): Boolean
    fun getFormatHelperText(format: String): String
    fun isNull(value: TDate?): Boolean
    fun isValid(value: Any): Boolean
    fun getDiff(value: TDate, comparing: TDate): Number
    fun getDiff(value: TDate, comparing: String): Number
    fun isEqual(value: Any, comparing: Any): Boolean
    fun isSameDay(value: TDate, comparing: TDate): Boolean
    fun isSameMonth(value: TDate, comparing: TDate): Boolean
    fun isSameYear(value: TDate, comparing: TDate): Boolean
    fun isSameHour(value: TDate, comparing: TDate): Boolean
    fun isAfter(value: TDate, comparing: TDate): Boolean
    fun isAfterDay(value: TDate, comparing: TDate): Boolean
    fun isAfterYear(value: TDate, comparing: TDate): Boolean
    fun isBeforeDay(value: TDate, comparing: TDate): Boolean
    fun isBeforeYear(value: TDate, comparing: TDate): Boolean
    fun isBefore(value: TDate, comparing: TDate): Boolean
    fun isWithinRange(value: TDate, range: dynamic /* JsTuple<TDate, TDate> */): Boolean
    fun startOfMonth(value: TDate): TDate
    fun endOfMonth(value: TDate): TDate
    fun startOfWeek(value: TDate): TDate
    fun endOfWeek(value: TDate): TDate
    fun addDays(value: TDate, count: Number): TDate
    fun addMonths(value: TDate, count: Number): TDate
    fun startOfDay(value: TDate): TDate
    fun endOfDay(value: TDate): TDate
    fun format(value: TDate, formatKey: Any): String
    fun formatByString(value: TDate, formatString: String): String
    fun formatNumber(numberToFormat: String): String
    fun getHours(value: TDate): Number
    fun setHours(value: TDate, count: Number): TDate
    fun getMinutes(value: TDate): Number
    fun setMinutes(value: TDate, count: Number): TDate
    fun getSeconds(value: TDate): Number
    fun setSeconds(value: TDate, count: Number): TDate
    fun getMonth(value: TDate): Number
    fun setMonth(value: TDate, count: Number): TDate
    fun getNextMonth(value: TDate): TDate
    fun getPreviousMonth(value: TDate): TDate
    fun getMonthArray(value: TDate): Array<TDate>
    fun getYear(value: TDate): Number
    fun setYear(value: TDate, count: Number): TDate
    fun mergeDateAndTime(date: TDate, time: TDate): TDate
    fun getWeekdays(): Array<String>
    fun getWeekArray(date: TDate): Array<Array<TDate>>
    fun getYearRange(start: TDate, end: TDate): Array<TDate>
    fun getMeridiemText(ampm: String): String
}
