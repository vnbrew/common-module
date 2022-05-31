package com.module.jetpack.compose.common.domain

interface UsersRepository {
    suspend fun getCurrentUser(): User?
}