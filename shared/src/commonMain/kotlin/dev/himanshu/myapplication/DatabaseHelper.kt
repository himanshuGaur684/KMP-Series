package dev.himanshu.myapplication

expect class DatabaseHelper {
    expect suspend fun connect()
}