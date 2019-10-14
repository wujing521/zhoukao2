package com.wujingjing.senior2.text;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;

import com.wujing.common.utils.StreamUtil;
import com.wujingjing.senior2.domain.Goods;

@ContextConfiguration(locations = "path:redis.xml")
public class GoodsTest {

	private RedisTemplate redisTemplate;
	
	@Test
	public void test() {
		for (int i = 0; i < 105; i++) {
			Goods goods = new Goods();
			goods.setId(i);
			goods.getBaifen();
			
		}
		
	}
}
