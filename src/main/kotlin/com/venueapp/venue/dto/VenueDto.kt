package com.venueapp.venue.dto

import com.venueapp.venue.datasource.VenueRepository
import com.venueapp.venue.model.BandEntity
import com.venueapp.venue.model.VenueEntity
import org.springframework.stereotype.Repository

@Repository
class VenueDto : VenueRepository {

    private val bandBBA = BandEntity("Hardcore","BBA")
    private val bandSidilarsen = BandEntity("Rock","Sidilarsen")
    private val bandKingCrimson = BandEntity("Progressif","King Crimson")
    val bandList = listOf(bandBBA, bandSidilarsen, bandKingCrimson)

    override fun getVenues(): Collection<VenueEntity> {

        return listOf(VenueEntity(1, "Black Lab", "22-04-2022", 12.0, bandList))
    }
}