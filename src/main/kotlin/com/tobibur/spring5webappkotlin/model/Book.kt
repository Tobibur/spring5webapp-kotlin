package com.tobibur.spring5webappkotlin.model

import javax.persistence.*

@Entity
data class Book(
        val title: String,
        val isbn: String,

        @OneToOne
        val publisher: Publisher,

        @ManyToMany
        @JoinTable(name = "author_book", joinColumns = [JoinColumn(name = "book_id")],
                inverseJoinColumns = [JoinColumn(name = "author_id")])
        val authors: Set<Author> = HashSet()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
}