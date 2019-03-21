package com.tobibur.spring5webappkotlin.controllers

import com.tobibur.spring5webappkotlin.repositories.BookRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class BookController(private val bookRepository: BookRepository) {


    @RequestMapping("/books")
    fun getBooks(model: Model): String {

        model.addAttribute("books", bookRepository.findAll())

        return "books"
    }
}