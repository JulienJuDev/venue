package com.venueapp.venue.controller

import com.venueapp.venue.dto.VenueDto
import com.venueapp.venue.model.VenueEntity
import com.venueapp.venue.service.VenueService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping("api/venues")
class VenueController() {

    var venueDto:VenueDto = VenueDto()
    private val venueService: VenueService = VenueService(venueDto)

    @GetMapping
    //fun printOk() = println("It' ok bro'")
    fun getVenues() : Collection<VenueEntity> {
        return venueService.getVenues()
    }

}