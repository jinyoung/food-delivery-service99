package fooddeliveryservice.domain;

import fooddeliveryservice.DeliveryManagementApplication;
import fooddeliveryservice.domain.FoodDelivered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)

    private String orderId;

    private String deliveryDriverId;

    private Address deliveryLocation;

    @PostPersist
    public void onPostPersist() {
        FoodDelivered foodDelivered = new FoodDelivered(this);
        foodDelivered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryManagementApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
