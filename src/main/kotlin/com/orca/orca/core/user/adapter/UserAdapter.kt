package com.orca.orca.core.user.adapter

import com.orca.orca.core.user.domain.User
import com.orca.orca.core.user.presentation.SignUpRequest
import org.springframework.stereotype.Component

@Component
class UserAdapter {
    fun toUser(request: SignUpRequest): User {
        return User().apply {
            loginId = request.loginId
            name = request.name
            birth = request.birth
        }
    }
}