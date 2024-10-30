package com.orca.orca.core.match.domain

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType

@Document(collection = "votes")
class Vote {
    @Field("_id", targetType = FieldType.OBJECT_ID)
    var id: String? = null

    var clubId: String? = null

    var memberId: String? = null

    var matchId: String? = null

    var isAttendance: Boolean? = false
}