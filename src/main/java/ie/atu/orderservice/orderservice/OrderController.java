package ie.atu.orderservice.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/addOrder")
    public String createOrder(@RequestBody OrderDetails orderDetails) {
        orderService.createOrder(orderDetails);
        return "Order created";
    }

    @GetMapping("/getOrder/{orderId}")
    public OrderDetails getOrderById(@PathVariable int orderId){
        return orderService.getOrderById(orderId);
    }

}
