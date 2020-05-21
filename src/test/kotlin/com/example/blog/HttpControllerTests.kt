package com.example.blog


import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@WebMvcTest
class HttpControllerTests(@Autowired val mockMvc: MockMvc) {
    @MockkBean
    private  lateinit var userRepository: UserRepository

    @MockkBean
    private  lateinit var articleRepository: ArticleRepository

    @Test
    fun `글 목록 가져오기`() {
        val gildong82 = User("gildong82", "Gildong", "Hong")
        val article1 = Article("첫 번째 글", "첫 번째 글", "첫 번째 글입니다.", gildong82)
        val article2 = Article("두 번째 글", "두 번째 글", "두 번째 글입니다.", gildong82)

        every {
            articleRepository.findAllByOrderByCreatedAtDesc()
        } returns listOf(article1, article2)

        mockMvc.perform(get("/api/article/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("\$.[0].author.login").value(gildong82.login))
                .andExpect(jsonPath("\$.[0].slug").value(article1.slug))
                .andExpect(jsonPath("\$.[1].author.login").value(gildong82.login))
                .andExpect(jsonPath("\$.[1].slug").value(article2.slug))
    }

    @Test
    fun `사용자 가져오기`() {
        val gildong82 = User("gildong82", "Gildong", "Hong")
        val gildong = User("gildong", "Gildong2", "Hong2")
        every {
            userRepository.findAll()
        } returns listOf(gildong82, gildong)

        mockMvc.perform(get("/api/user/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk)
                .andExpect(content().contentType((MediaType.APPLICATION_JSON)))
                .andExpect(jsonPath("\$.[0].login").value(gildong82.login))
                .andExpect(jsonPath("\$.[1].login").value(gildong.login))
    }
}