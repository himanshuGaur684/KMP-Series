package dev.himanshu.myapplication

import platform.Foundation.NSDate
import platform.Foundation.NSDateFormatter
import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.dateWithTimeIntervalSince1970

actual class DateFormatterCommon {

    private val formatter = NSDateFormatter()
        .apply {
            dateFormat = "dd/MM/yyyy"
            locale = NSLocale.currentLocale()
        }

    actual fun format(timeInMillis: Long): String {
        val seconds = timeInMillis.div(1000.0)
        val date = NSDate.dateWithTimeIntervalSince1970(seconds)
        return formatter.stringFromDate(date)
    }
}