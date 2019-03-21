package com.tobibur.spring5webappkotlin.controllers

import com.tobibur.spring5webappkotlin.repositories.AuthorRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class AuthorController(private val authorRepository: AuthorRepository) {

    @RequestMapping("/authors")
    fun getAuthors(model: Model): String {

        model.addAttribute("authors", authorRepository.findAll())

        return "authors"
    }
}