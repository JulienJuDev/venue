package com.venueapp.venue.service

import com.venueapp.venue.datasource.VenueRepository
import com.venueapp.venue.model.VenueEntity
import org.springframework.stereotype.Service

@Service
class VenueService(private val datasource: VenueRepository) {

    fun getVenues(): Collection<VenueEntity> {
       return datasource.getVenues()
    }
}