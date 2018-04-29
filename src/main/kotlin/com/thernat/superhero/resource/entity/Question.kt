package com.thernat.superhero.resource.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Question(val name: String, val alias: String, val gender: String = "male") {

    constructor() :this("","","")

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

}