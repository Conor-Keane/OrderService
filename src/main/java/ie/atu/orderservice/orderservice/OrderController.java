package ie.atu.orderservice.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/addOrder")
    public  String addOrder(@RequestBody OrderDetails orderDetails) {
        orderService.addOrder(orderDetails);
        return "Order created";
    }

    @GetMapping("/getOrder")
    public @RequestBody List<OrderService>getOrder() {
        return orderService.getOrder();
    }

}
