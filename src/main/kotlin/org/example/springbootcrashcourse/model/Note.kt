package org.example.springbootcrashcourse.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document("notes")
data class Note(
    @Id val id: ObjectId = ObjectId.get(),
    val title: String,
    val content: String,
    val ownerId: ObjectId,
    val createdAt: Instant
)
