package com.example.customer.service.impl;

import com.example.customer.feignServiceClient.FeignProducerService;
import com.example.customer.service.CustomerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    FeignProducerService feignProducerService;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "returnErr")
    public String getPort(String name) {
        //String body = restTemplate.getForObject("http://localhost:8090/producer?name=aaaa", String.class);
        //log.info("调取内容是" + body);
        try{

        log.info("开始消费");
        //return body;
        String codeKey = "aaaaaaaaaaa";
        String c = (String) redisTemplate.opsForValue().get(codeKey);
        log.info("获取的内容是{}",c);
        return c;
        }catch (Exception e){
            log.error(e.getMessage());
            return "失败";
        }
        //return feignProducerService.getPort(name);
    }

    public String returnErr(String name){
        return "出错了";
    }
}
