package com.venueapp.venue

import com.venueapp.venue.controller.VenueController
import com.venueapp.venue.dto.VenueDto
import com.venueapp.venue.service.VenueService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VenueApplication

fun main(args: Array<String>) {
	runApplication<VenueApplication>(*args)

	val vc = VenueController()
	val venueList = vc.getVenues()
	venueList.forEach {
		println(it.toString())
	}
}
