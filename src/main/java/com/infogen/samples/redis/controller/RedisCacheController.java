package com.infogen.samples.redis.controller;

import com.infogen.samples.redis.service.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisCacheController {

    CacheService cacheService;

    public RedisCacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("set/{id}/{value}")
    public String setData(@PathVariable String id, @PathVariable String value) {
        return cacheService.setValue(id, value);
    }

    @GetMapping("get/{id}")
    public String getData(@PathVariable String id) {
        return cacheService.getValue(id);
    }
}
