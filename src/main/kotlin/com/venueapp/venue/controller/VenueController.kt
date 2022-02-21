package com.venueapp.venue.controller

import com.venueapp.venue.model.VenueEntity
import com.venueapp.venue.service.VenueService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/venues")
class VenueController(private val service: VenueService) {

    @GetMapping
    fun printOk() = println("It' ok bro'")
    //fun getVenues() : Collection<VenueEntity> = service.getVenues()

}