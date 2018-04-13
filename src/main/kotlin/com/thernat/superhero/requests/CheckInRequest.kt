package com.thernat.superhero.requests

class CheckInRequest(val hotelName : String,val nbOfGuests : Int) {

    constructor() :this("",3)
}