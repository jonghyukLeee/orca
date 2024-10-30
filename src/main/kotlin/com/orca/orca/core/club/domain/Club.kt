package com.orca.orca.core.club.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType

@Document(collection = "clubs")
class Club {
    @Field("_id", targetType = FieldType.OBJECT_ID)
    @Id
    var id: String? = null

    var name: String? = null

    var memberCount: Int? = 0

    var win: Int? = 0

    var draw: Int? = 0

    var lose: Int? = 0

    var scored: Int? = 0

    var conceded: Int? = 0
}