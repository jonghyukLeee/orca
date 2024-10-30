package com.orca.orca.core.match.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType
import java.time.LocalDateTime

@Document(collection = "matches")
class Match {
    @Field("_id", targetType = FieldType.OBJECT_ID)
    @Id
    var id: String? = null

    var clubId: String? = null

    var opponentId: String? = null

    var goal: Int? = 0

    var scored: Int? = 0

    var conceded: Int? = 0

    var result: MatchResultType? = null

    var matchDateTime: LocalDateTime? = null

    var isDone: Boolean? = null
}