package dev.himanshu.myapplication

class GetUserUseCase(private val repository: UserRepository) {
    suspend operator fun invoke() = repository.getUser()
}