package datefns.formats

import dateio.core.DateIOFormats
import kotlinext.js.jsObject

typealias DateFnsDateIOFormats = DateIOFormats<String>

internal val defaultDateFnsFormats: DateFnsDateIOFormats = jsObject {
    dayOfMonth = "d"
    fullDate = "PP"
    fullDateTime = "PP p"
    fullDateTime12h = "PP hh:mm aaa"
    fullDateTime24h = "PP HH:mm"
    fullTime = "p"
    fullTime12h = "hh:mm aaa"
    fullTime24h = "HH:mm"
    hours12h = "hh"
    hours24h = "HH"
    keyboardDate = "P"
    keyboardDateTime = "P p"
    keyboardDateTime12h = "P hh:mm aaa"
    keyboardDateTime24h = "P HH:mm"
    minutes = "mm"
    month = "LLLL"
    monthAndDate = "MMMM d"
    monthAndYear = "LLLL yyyy"
    monthShort = "MMM"
    normalDate = "d MMMM"
    normalDateWithWeekday = "EEE, MMM d"
    seconds = "ss"
    shortDate = "MMM d"
    year = "yyyy"
}
