package com.venueapp.venue.dto

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VenueDtoTest {

    private val venueDto = VenueDto()

    @Test
    fun `should return collection of Venues`(){

        //when
        val venues = venueDto.getVenues()

        //then
        Assertions.assertThat(venues).isNotEmpty
    }

    @Test
    fun `should return data to dto`(){

        //when
        val venues = venueDto.getVenues()
        //then
        assertThat(venues).allMatch {it.id != 0}
        assertThat(venues).allMatch {it.place.isNotBlank()}
        assertThat(venues).allMatch {it.date.isNotBlank()}
        assertThat(venues).allMatch {it.price != 0.0}
        assertThat(venues).allMatch {it.bandList.isNotEmpty()}

    }

}