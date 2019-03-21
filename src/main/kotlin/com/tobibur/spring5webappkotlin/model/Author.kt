package com.tobibur.spring5webappkotlin.model

import javax.persistence.*

@Entity
data class Author(
        val firstName: String,
        val lastName: String,
        @ManyToMany(mappedBy = "authors")
        val books: Set<Book> = HashSet()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
}