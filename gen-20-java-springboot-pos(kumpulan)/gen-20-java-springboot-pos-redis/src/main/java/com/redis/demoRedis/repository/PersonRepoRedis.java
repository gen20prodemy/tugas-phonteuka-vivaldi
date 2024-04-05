package com.redis.demoRedis.repository;

import com.redis.demoRedis.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepoRedis extends JpaRepository<PersonEntity, Integer> {
}
