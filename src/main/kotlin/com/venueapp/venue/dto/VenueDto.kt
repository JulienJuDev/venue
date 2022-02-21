package com.venueapp.venue.dto

import com.venueapp.venue.datasource.VenueRepository
import com.venueapp.venue.model.VenueEntity
import org.springframework.stereotype.Repository

import java.util.ArrayList



@Repository
class VenueDto : VenueRepository {

    val band1:String = "BBA"
    val band2:String = "Sidilarsen"
    val bandList = ArrayList<String>()


    override fun getVenues(): Collection<VenueEntity> {
        bandList.add(band1)
        bandList.add(band2)
        return listOf(VenueEntity(1, "Black Lab", "22-04-2022", 12.0, bandList))
    }

}