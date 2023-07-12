package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import fooddeliveryservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodDelivered extends AbstractEvent {

    public FoodDelivered(Delivery aggregate) {
        super(aggregate);
    }

    public FoodDelivered() {
        super();
    }
}
