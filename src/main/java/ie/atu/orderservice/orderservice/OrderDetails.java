package ie.atu.orderservice.orderservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
    @JsonProperty("orderId")
    private int orderId;

    @JsonProperty("productId")
    private int productId;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("customerId")
    private int customerId;
}
