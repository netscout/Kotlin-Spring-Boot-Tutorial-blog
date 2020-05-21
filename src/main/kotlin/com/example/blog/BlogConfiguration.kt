package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {
    @Bean
    fun databaseInitializer(
            userRepository: UserRepository,
            articleRepository: ArticleRepository) = ApplicationRunner {
        val gildong82 = userRepository.save(
                User("gildong82", "Gildong", "Hong"))
        articleRepository.save(
                Article(
                        title = "첫 번째 글",
                        headline = "첫 번째 글이라오",
                        content = "이건 첫 번째 글인데... 와 진짜",
                        author = gildong82
                ))
        articleRepository.save(
                Article(
                        title = "두 번째 글",
                        headline = "두 번째 글이라오",
                        content = "이건 두 번째 글이란 말이야...",
                        author = gildong82
                ))
    }
}