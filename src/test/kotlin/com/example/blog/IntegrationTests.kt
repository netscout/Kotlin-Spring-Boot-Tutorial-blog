package com.example.blog

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTests(@Autowired val restTemplate: TestRestTemplate) {
    @BeforeAll
    fun setup() {
        println(">> Setup")
    }

    @Test
    fun `블로그 페이지 타이틀, 내용, 상태 코드 검사`() {
        val entity = restTemplate.getForEntity<String>("/")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).contains("<h1>My Blog</h1>")
    }

    @Test
    fun `블로그 글 조회 페이지 타이틀, 내용, 상태 코드 검사`()
    {
        println(">> 블로그 글 조회 페이지 타이틀, 내용, 상태 코드 검사")
        val title = "첫 번째 글"
        val entity = restTemplate.getForEntity<String>("/article/${title.toSlug()}")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).contains(title, "첫 번째 글이라오", "이건 첫 번째 글인데... 와 진짜")
    }

    @AfterAll
    fun teardown() {
        println(">> Tear down")
    }
}