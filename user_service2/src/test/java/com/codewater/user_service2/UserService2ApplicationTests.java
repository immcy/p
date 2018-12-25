package com.codewater.user_service2;

import com.codewater.user_service2.redis.JedisClusterConfig;
import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserService2ApplicationTests {

    @Autowired
    JedisCluster jedisCluster;
    @Test
    public void contextLoads() {
//        JedisCluster jedisCluster = new JedisClusterConfig().getJedisCluster();
        jedisCluster.set("name","zhang");
        System.out.println(jedisCluster.get("name"));
    }

}

