/*
package com.dev.pos.repository;

import com.dev.pos.dto.PersonDTORedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepoRedis {
    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY = "Person";

    public boolean savePerson(PersonDTORedis person) {
        try{
            redisTemplate.opsForHash().put(KEY, person.getId().toString(), person);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<PersonDTORedis> fetchAllPerson() {
        List<PersonDTORedis> person;
        person = redisTemplate.opsForHash().values(KEY);
        return person;
    }
}
*/
