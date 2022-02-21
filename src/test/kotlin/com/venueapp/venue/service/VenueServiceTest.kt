package com.venueapp.venue.service

import com.venueapp.venue.datasource.VenueRepository
import com.venueapp.venue.model.VenueEntity
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VenueServiceTest {

    private val dataSource: VenueRepository = mockk(relaxed = true)
    private val venueService = VenueService(dataSource)

    @Test
    fun `should call its repository to get venues datas`(){
        // given
        every { dataSource.getVenues() } returns emptyList()
        //when
        val venues = venueService.getVenues()

        //then
        verify(exactly = 1) { dataSource.getVenues() }
    }
}