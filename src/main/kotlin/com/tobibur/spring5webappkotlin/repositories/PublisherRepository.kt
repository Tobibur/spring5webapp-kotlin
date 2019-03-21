package com.tobibur.spring5webappkotlin.repositories

import com.tobibur.spring5webappkotlin.model.Publisher
import org.springframework.data.repository.CrudRepository

interface PublisherRepository : CrudRepository<Publisher, Long> {
}