package com.example.springkotlin.storage.db.core

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime


@MappedSuperclass
abstract class BaseEntity {

    @CreationTimestamp
    @Column(updatable = false)
    val createdAt: LocalDateTime? = null

    @UpdateTimestamp
    @Column
    var updatedAt: LocalDateTime? = null
        protected set
}