package com.thernat.superhero.controllers

import com.thernat.superhero.resource.QuestionRepository
import com.thernat.superhero.resource.entity.Question
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/quiz")
class QuizController(val questionRepository: QuestionRepository) {

    @GetMapping("/questions")
    fun all(): MutableIterable<Question> = this.questionRepository.findAll()

    @GetMapping("/{name}")
    fun byName(@PathVariable(value = "name")name: String ): List<Question> = questionRepository.findByName(name)

}


