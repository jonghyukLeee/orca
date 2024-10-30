package com.orca.orca.core.club.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType

//TODO Auditing
@Document(collection = "members")
class Member {
    @Field("_id", targetType = FieldType.OBJECT_ID)
    @Id
    var id: String? = null

    var userId: String? = null

    var clubId: String? = null
}