package com.orca.orca.core.match.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType

@Document(collection = "goals")
class Goal {
    @Field("_id", targetType = FieldType.OBJECT_ID)
    @Id
    var id: String? = null

    var matchId: String? = null

    var clubId: String? = null

    var type: AttackPointType? = null

    var memberId: String? = null

    var scoredTime: Int? = 0
}