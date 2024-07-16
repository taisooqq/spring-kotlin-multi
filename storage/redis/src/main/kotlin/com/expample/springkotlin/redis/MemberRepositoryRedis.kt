package com.expample.springkotlin.redis

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepositoryRedis: CrudRepository<Member, String>{

}