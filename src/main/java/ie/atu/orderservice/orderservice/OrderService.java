package ie.atu.orderservice.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@FeignClient(name = "Order-service", url = "http://localhost:8081")
public class OrderService {
    private final OrderClient orderClient;
    private List<OrderDetails> Library = new ArrayList<>();

    public OrderService(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    public void createOrder(OrderDetails orderDetails) {
        Library.add(orderDetails);
    }

    public OrderDetails getOrderById(int orderId) {
        return orderClient.getOrderById(orderId);
    }


}
