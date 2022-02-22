package com.venueapp.venue.datasource

import com.venueapp.venue.model.VenueEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//@Repository
interface VenueRepository : MongoRepository<VenueEntity, String> {
    fun getVenues(): Collection<VenueEntity>
}