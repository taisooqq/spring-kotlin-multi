package com.example.springkotlin.storage.db.core

import org.springframework.data.jpa.repository.JpaRepository


interface ExampleRepository : JpaRepository<Long, ExampleEntity>