package com.orca.orca.core.user.service

import com.orca.orca.core.user.domain.User
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Service
class UserService(
    val userManager: UserManager
) {
    @Transactional
    fun signUp(userInfo: User): User {
        return userManager.create(userInfo)
    }
}