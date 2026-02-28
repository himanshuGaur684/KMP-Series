package dev.himanshu.myapplication

class IosLogger : Logger {
    override fun log(message: String) {
        println(message)
    }
}