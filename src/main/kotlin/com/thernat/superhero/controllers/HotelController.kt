package com.thernat.superhero.controllers

import com.thernat.superhero.requests.CheckInRequest
import com.thernat.superhero.resource.HotelRepository
import com.thernat.superhero.resource.entity.Hotel
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hotels")
class HotelController(val hotelRepository: HotelRepository) {

    @GetMapping("/all")
    fun all(): MutableIterable<Hotel> = this.hotelRepository.findAll()

    @GetMapping("/{name}")
    fun byName(@PathVariable(value = "name")name: String ): List<Hotel> = hotelRepository.findByName(name)

    @PostMapping("/checking")
    fun checkIn(@RequestBody checkInRequest: CheckInRequest){
        val hotel = this.hotelRepository.findByName(checkInRequest.hotelName)[0]
        hotel.checkIn(1)
        this.hotelRepository.save(hotel)
    }
}


