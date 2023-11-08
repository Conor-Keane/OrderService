package ie.atu.orderservice.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Customer-service", url = "http://localhost:8082")
public interface OrderClient {
    @GetMapping("/getOrderById")
    OrderDetails getOrderById(@PathVariable("orderId") int orderId);
}
