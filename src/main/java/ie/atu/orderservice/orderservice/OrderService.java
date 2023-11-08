package ie.atu.orderservice.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Order-service", url = "http://localhost:8081")
public interface OrderService {
    @PostMapping("/createOrder")
    String orderDetails();

}
