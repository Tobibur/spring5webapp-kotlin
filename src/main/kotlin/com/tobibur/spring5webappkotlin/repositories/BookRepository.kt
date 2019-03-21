package com.tobibur.spring5webappkotlin.repositories

import com.tobibur.spring5webappkotlin.model.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, Long> {

}