package fooddeliveryservice.domain;

import fooddeliveryservice.OrderAndPaymentApplication;
import fooddeliveryservice.domain.OrderPlaced;
import fooddeliveryservice.domain.PaymentProcessed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)

    private String userId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)

    private String menuId;

    private Integer amount;

    @Embedded
    @AttributeOverride(
        name = "menuId",
        column = @Column(name = "orderDetailmenuId", nullable = true)
    )
    @AttributeOverride(
        name = "amount",
        column = @Column(name = "orderDetailamount", nullable = true)
    )
    private OrderDetail 세부주문;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        PaymentProcessed paymentProcessed = new PaymentProcessed(this);
        paymentProcessed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderAndPaymentApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
