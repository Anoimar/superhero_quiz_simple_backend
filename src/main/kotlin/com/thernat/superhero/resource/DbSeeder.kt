package com.thernat.superhero.resource

import com.thernat.superhero.resource.entity.Question
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbSeeder(val questionRepository: QuestionRepository) : CommandLineRunner{

    override fun run(vararg args: String?) {
        this.questionRepository.deleteAll()


        val batman = Question(name = "Batman",alias = "Bruce Wayne")
        val superman = Question(name = "Superman",alias = "Clark Kent")
        val cyborg = Question(name = "Cyborg",alias = "Bruce Wayne")
        val greenLantern = Question(name = "Green Lantern",alias = "Hal Jordan")
        val heroes = mutableListOf(batman,superman,cyborg,greenLantern)


        questionRepository.save(heroes)
        println("Database has been filled")
    }
}