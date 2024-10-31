package com.orca.orca.core.user.repository

import com.orca.orca.core.user.domain.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String> {

}