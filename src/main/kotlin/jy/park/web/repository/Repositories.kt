package jy.park.web.repository

import jy.park.web.model.Article
import jy.park.web.model.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository: CrudRepository<Article, Long> {
    fun findAllByOrderByCreatedAtDesc(): Iterable<Article>
}

interface UserRepository: CrudRepository<User, String>