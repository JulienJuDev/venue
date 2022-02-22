package com.venueapp.venue.model

import java.sql.Date

data class VenueEntity(
    val id: Int,
    var place: String,
    var date: String,
    var price: Double,
    var bandList: List<BandEntity>
)