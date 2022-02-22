package com.venueapp.venue.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class BandEntity (

    @Id
    var id: String,
    var style: String,
    var name: String
    )


