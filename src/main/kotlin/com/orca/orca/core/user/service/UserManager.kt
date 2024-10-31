package com.orca.orca.core.user.service

import com.orca.orca.core.user.domain.User
import com.orca.orca.core.user.repository.UserRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Transactional
@Component
class UserManager(
    val userRepository: UserRepository
) {
    fun create(user: User): User {
        return userRepository.save(user)
    }
}