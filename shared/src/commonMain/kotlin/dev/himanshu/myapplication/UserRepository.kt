package dev.himanshu.myapplication

import kotlinx.coroutines.delay

class UserRepository(val client: CommonHttpClient) {
    suspend fun getUser(): User {
        delay(1000)
        return User(
            name = "Himanshu Gaur",
            age = 12
        )
    }
}