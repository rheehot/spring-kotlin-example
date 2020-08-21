package com.example.demo

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
@Entity
class Article(
        var title: String,
        var headline: String,
        var content: String,
        @ManyToOne var author: User,
        var slug: String = title.toSlug(),
        var addedAt: LocalDateTime = LocalDateTime.now(),
        @Id @GeneratedValue var id: Long? = null
)

@Entity
class User(
        var login: String,
        var firstname: String,
        var lastname: String,
        var description: String? = null,
        @Id @GeneratedValue var id: Long? = null
)
