package com.ms.tutorial.userservice.feignclients;

import com.ms.tutorial.userservice.models.Bike;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "bike-service", url = "localhost:8002/bike")
@RequestMapping("/bike")
public interface BikeFeignClient {

    @PostMapping()
    Bike save(@RequestBody Bike bike);

    @GetMapping("/byuser/{userId}")
    List<Bike> getBikes(@PathVariable("userId") int userId);

}
