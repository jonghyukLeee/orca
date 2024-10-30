package com.orca.orca.core.user

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType

//TODO Auditing
@Document(collection = "users")
class User {
    @Field("_id", targetType = FieldType.OBJECT_ID)
    @Id
    var id: String? = null

    var birth: String? = null

    var loginId: String? = null

    var loginPlatform: String? = null
}