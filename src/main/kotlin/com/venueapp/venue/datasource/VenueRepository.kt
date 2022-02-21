package com.venueapp.venue.datasource

import com.venueapp.venue.model.VenueEntity
import org.springframework.stereotype.Repository

@Repository
interface VenueRepository {
    fun getVenues(): Collection<VenueEntity>
}