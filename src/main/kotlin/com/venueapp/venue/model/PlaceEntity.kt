package com.venueapp.venue.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class PlaceEntity (
    @Id
    var id:String,
    var name: String,
    var address: String
)