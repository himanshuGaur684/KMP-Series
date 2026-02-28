package dev.himanshu.myapplication

import java.text.SimpleDateFormat

actual class DateFormatterCommon {
    actual fun format(timeInMillis: Long): String {
        val format = SimpleDateFormat("dd/MM/yyyy")
        val date = java.util.Date(timeInMillis)
        return format.format(date)
    }
}