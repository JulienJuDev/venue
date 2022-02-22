package com.venueapp.venue.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
@Document
data class VenueEntity(

    @Id
    val id: String,
    var place: String,
    var date: String,
    var price: Double,
    var bandList: List<BandEntity>
    )


