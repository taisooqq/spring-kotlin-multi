package com.example.springkotlin.storage.db.core

import org.springframework.data.jpa.repository.JpaRepository


internal interface ExampleRepository : JpaRepository<Long, ExampleEntity>