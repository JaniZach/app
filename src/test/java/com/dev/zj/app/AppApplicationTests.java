package com.dev.zj.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppApplicationTests {

	@Autowired
	private StringRedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
		redisTemplate.opsForValue().set("aaa","111");
		Assert.assertEquals("111", redisTemplate.opsForValue().get("aaa"));
	}

	@Test
	public void redisGet() {
		String value = redisTemplate.opsForValue().get("aaa");
		System.out.println(value);
	}

	@Test
	public void redisDelete() {
		redisTemplate.delete("aaa");
		String value = redisTemplate.opsForValue().get("aaa");
		System.out.println("redis中的值为："+value);
	}

	@Test
	public void redisHasKey() {
		Boolean hasKey = redisTemplate.hasKey("aaa");
		System.out.println("redis中是否有aaa：" + hasKey);
	}
}
