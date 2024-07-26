package com.example.springkotlin.storage.db.core

import jakarta.persistence.*

@Entity
@Table(name = "example")
class ExampleEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,
    @Column
    val exampleColumn: String,

): BaseEntity()