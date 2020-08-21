package com.example.demo

import org.springframework.data.repository.CrudRepository

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}