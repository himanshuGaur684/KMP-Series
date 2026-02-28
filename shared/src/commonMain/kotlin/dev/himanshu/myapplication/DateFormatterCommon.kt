package dev.himanshu.myapplication

expect class DateFormatterCommon {
    fun format(timeInMillis: Long): String
}