package com.codewater.user_service2.redis;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import javax.inject.Singleton;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class JedisClusterConfig {
    @Value("${spring.redis.cluster.nodes}")
    private String clusterNodes;


    @Bean
    @Singleton
    public JedisCluster getJedisCluster(){
        String[] serverArray = clusterNodes.split(",");

        Set<HostAndPort> nodes = new HashSet<>();
        for (String ipPort: serverArray) {
            String[] ipPortPair = ipPort.split(":");
            nodes.add(new HostAndPort(ipPortPair[0],Integer.valueOf(ipPortPair[1])));
        }
        return new JedisCluster(nodes,2000);

    }
}
