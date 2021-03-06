package jy.park.web.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Article(
        val title: String,
        val headline: String,
        val content: String,
        @ManyToOne @JoinColumn val author: User,
        @Id @GeneratedValue val id: Long? = null,
        val createdAt: LocalDateTime = LocalDateTime.now()

)

@Entity
data class User(
        @Id val login: String,
        val firstName: String,
        val lastName: String,
        val description: String? = null
)