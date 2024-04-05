package com.dev.pos.repository;

import com.dev.pos.entity.PersonEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepoRedis extends  JpaRepository<PersonEntity, Integer>{
    /*public static final String HASH_KEY = "Person";
    @Autowired
    private RedisTemplate redisTemplate;

    public PersonEntity save(PersonEntity personEntity){
        redisTemplate.opsForValue().set(HASH_KEY,"personEntity.getId()");
        return personEntity;
    }

    public List<PersonEntity> findAll(){
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public PersonEntity findPerson(int id){
        return (PersonEntity) redisTemplate.opsForHash().get(HASH_KEY, id);
    }

    public String delete(int id){
        redisTemplate.opsForHash().delete(HASH_KEY, id);
        return "person removed";
    }*/
}
