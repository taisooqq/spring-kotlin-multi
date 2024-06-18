package com.example.springkotlin.storage.db.core

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
internal class ExampleEntity(

    @Column
    val exampleColumn: String,

): BaseEntity()