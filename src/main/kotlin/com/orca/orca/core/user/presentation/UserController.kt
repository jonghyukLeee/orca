package com.orca.orca.core.user.presentation

import com.orca.orca.core.user.adapter.UserAdapter
import com.orca.orca.core.user.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/api/user")
class UserController(
    val userAdapter: UserAdapter,
    val userService: UserService
) {
    @PostMapping
    fun signUp(@RequestBody request: SignUpRequest): ResponseEntity<String> {
        val user = userService.signUp(userAdapter.toUser(request))
        return ResponseEntity.ok().body(user.id)
    }
}