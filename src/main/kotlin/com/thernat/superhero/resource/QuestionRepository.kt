package com.thernat.superhero.resource

import com.thernat.superhero.resource.entity.Question
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepository :  CrudRepository<Question,Long>{

    fun findByName(name: String): List<Question>


}