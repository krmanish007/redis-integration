package com.infogen.samples.redis.controller;

import com.infogen.samples.redis.service.CacheService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RedisCacheController {

    private final CacheService cacheService;

    public RedisCacheController(final CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @PostMapping("set")
    public String setData(@RequestParam final String id, @RequestParam final String value) {
        return cacheService.put(id, value);
    }

    @GetMapping("get/{id}")
    public String getData(@PathVariable final String id) {
        return cacheService.get(id);
    }
}
