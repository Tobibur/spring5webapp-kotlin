package com.tobibur.spring5webappkotlin.repositories

import com.tobibur.spring5webappkotlin.model.Author
import org.springframework.data.repository.CrudRepository

interface AuthorRepository : CrudRepository<Author, Long> {
}