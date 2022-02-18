package com.venueapp.venue.model

import java.sql.Date

data class VenueEntity(
    var place: String,
    var date: Date,
    var price: Double,
    var bandList: ArrayList<String>
)