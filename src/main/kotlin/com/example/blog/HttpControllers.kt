package com.example.blog

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/article")
class ArticleController(private val repository: ArticleRepository) {
    @GetMapping("/")
    fun findAll() = repository.findAllByOrderByCreatedAtDesc()

    @GetMapping("/{slug}")
    fun findOne(@PathVariable slug: String) =
            repository.findBySlug(slug)
                    ?: ResponseStatusException(HttpStatus.NOT_FOUND, "글을 찾을 수 없습니다.")
}

@RestController
@RequestMapping("api/user")
class UserController(private val repository: UserRepository) {
    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String) =
            repository.findByLogin(login)
                    ?: ResponseStatusException(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다.")
}