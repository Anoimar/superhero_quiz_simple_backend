package com.thernat.superhero.resource

import com.thernat.superhero.resource.entity.Question
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbSeeder(val questionRepository: QuestionRepository) : CommandLineRunner{

    override fun run(vararg args: String?) {
        this.questionRepository.deleteAll()


        val batman = Question(name = "Batman",alias = "Bruce Wayne",imageUrl = "https://vignette.wikia.nocookie.net/marvel_dc/images/7/7b/Batman_Vol_2_9_Textless_Variant.jpg/revision/latest/scale-to-width-down/79?cb=20120510175322")
        val superman = Question(name = "Superman",alias = "Clark Kent",imageUrl = "https://vignette.wikia.nocookie.net/marvel_dc/images/1/1f/Superman_Prime_Earth_0003.jpg/revision/latest/scale-to-width-down/79?cb=20130609173921")
        val cyborg = Question(name = "Cyborg",alias = "Victor Stone",imageUrl = "https://vignette.wikia.nocookie.net/marvel_dc/images/4/45/Cyborg_0012.jpg/revision/latest/scale-to-width-down/80?cb=20120302021152")
        val greenLantern = Question(name = "Green Lantern",alias = "Hal Jordan",imageUrl = "https://vignette.wikia.nocookie.net/marvel_dc/images/9/93/Hal_Jordan_018.jpg/revision/latest/scale-to-width-down/80?cb=20091107061712")
        val heroes = mutableListOf(batman,superman,cyborg,greenLantern)


        questionRepository.save(heroes)
        println("Database has been filled")
    }
}