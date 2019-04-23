package com.example.customer.feignServiceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="producer-service")
public interface FeignProducerService {

    @GetMapping("/producer")
    String getPort(@RequestParam("name") String name);
}
