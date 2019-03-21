package com.tobibur.spring5webappkotlin.bootsrap

import com.tobibur.spring5webappkotlin.model.Author
import com.tobibur.spring5webappkotlin.model.Book
import com.tobibur.spring5webappkotlin.model.Publisher
import com.tobibur.spring5webappkotlin.repositories.AuthorRepository
import com.tobibur.spring5webappkotlin.repositories.BookRepository
import com.tobibur.spring5webappkotlin.repositories.PublisherRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class DevBootstrap(private val authorRepository: AuthorRepository,
                   private val bookRepository: BookRepository,
                   private val publisherRepository: PublisherRepository
) : ApplicationListener<ContextRefreshedEvent> {

    override fun onApplicationEvent(contextRefreshedEvent: ContextRefreshedEvent) {
        initData()
    }

    private fun initData() {

        val publisher = Publisher("Harper Collins", "US")

        publisherRepository.save(publisher)

        val eric = Author("Eric", "Evans")
        val ddd = Book("Domain Driven Design", "1234", publisher)

        eric.books.plus(ddd)
        ddd.authors.plus(eric)

        authorRepository.save(eric)
        bookRepository.save(ddd)

        val publisher1 = Publisher("Worx", "US")

        publisherRepository.save(publisher1)

        //Rod
        val rod = Author("Rod", "Johnson")
        val noEJB = Book("J2EE Development without EJB", "23444", publisher1)
        rod.books.plus(noEJB)
        noEJB.authors.plus(rod)

        authorRepository.save(rod)
        bookRepository.save(noEJB)

    }


}