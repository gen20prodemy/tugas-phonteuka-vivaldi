package com.redis.demoRedis.config;

import com.redis.demoRedis.dto.PersonDTORedis;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String, PersonDTORedis> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, PersonDTORedis> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        // Serializer untuk key Redis (String)
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // Serializer untuk value Redis (PersonDTO)
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(PersonDTORedis.class));
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }
}
