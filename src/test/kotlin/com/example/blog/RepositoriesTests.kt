package com.example.blog

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
        val entityManager: TestEntityManager,
        val userRepository: UserRepository,
        val articleRepository: ArticleRepository) {
    @Test
    fun `findByIdOrNull을 통해 Article 가져오기`() {
        val gildong = User("spring_gildong", "Gildong", "Hong")
        entityManager.persist(gildong)
        val article = Article(
                "코틀린 - 스프링부트 2.3",
                "아 이게 왠 삽질인가",
                "어쩌고 저쩌고 내용",
                gildong)
        entityManager.persist(article)
        entityManager.flush()
        //https://tourspace.tistory.com/114
        //!!을 붙이면 해당 변수가 속성은 null이 될 수 없음
        val found = articleRepository.findByIdOrNull(article.id!!)
        assertThat(found).isEqualTo(article)
    }

    @Test
    fun `findByLogin을 통해 User 가져오기`() {
        val gildong = User("spring_gildong", "Gildong", "Hong")
        entityManager.persist(gildong)
        entityManager.flush()
        val user = userRepository.findByLogin(gildong.login)
        assertThat(user).isEqualTo(gildong)
    }
}