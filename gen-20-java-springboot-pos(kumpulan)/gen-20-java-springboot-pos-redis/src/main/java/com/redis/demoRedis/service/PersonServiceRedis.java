package com.redis.demoRedis.service;

import com.redis.demoRedis.dto.PersonDTORedis;
import com.redis.demoRedis.repository.PersonRepoRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class PersonServiceRedis {
    @Autowired
    private PersonRepoRedis personRepoRedis;
    @Autowired
    private RedisTemplate<String, PersonDTORedis> redisTemplate;

    public List<PersonDTORedis> getCategoryRedis() {
        List<PersonDTORedis> categories = new ArrayList<>();

        // Ambil semua kunci Redis untuk kategori
        Set<String> keys = redisTemplate.keys("person:*");

        // Iterasi setiap kunci dan ambil nilainya dari Redis
        for (String key : keys) {
            PersonDTORedis category = redisTemplate.opsForValue().get(key);
            categories.add(category);
        }

        System.out.println("Data kategori berhasil diambil dari Redis ");

        return categories;
    }

    public PersonDTORedis createCategoryRedis(PersonDTORedis personDTORedis) {
        String redisKey = "person:" + personDTORedis.getId();
        redisTemplate.opsForValue().set(redisKey, personDTORedis);

        return personDTORedis;
    }
}
