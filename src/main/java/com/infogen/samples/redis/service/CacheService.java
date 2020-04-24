package com.infogen.samples.redis.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CacheService {

    @Cacheable("redis")
    public String getValue(String id) {
        //UUID will only return if setValue is not called for that id
        return UUID.randomUUID().toString();
    }

    @CachePut(value = "redis", key="#id")
    public String setValue(String id, String value) {
        return value;
    }
}
