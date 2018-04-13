package com.thernat.superhero.resource

import com.thernat.superhero.resource.entity.Hotel
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbSeeder(val hotelRepository: HotelRepository) : CommandLineRunner{

    override fun run(vararg args: String?) {
        this.hotelRepository.deleteAll()

        val moonHostel = Hotel(name = "Moon Hotel Gdańsk",classification = 3,nbRooms = 30)
        val qubus = Hotel(name = "Qubus Hotel Gdańsk",classification = 5,nbRooms = 90)
        val hanza = Hotel(name = "Hanza Hotel",classification = 4,nbRooms = 40)

        val hotels = mutableListOf<Hotel>()
        hotels.add(moonHostel)
        hotels.add(qubus)
        hotels.add(hanza)

        hotelRepository.save(hotels)
        println("Database has been filled")
    }
}