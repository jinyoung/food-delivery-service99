package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import fooddeliveryservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentProcessed extends AbstractEvent {

    public PaymentProcessed(Order aggregate) {
        super(aggregate);
    }

    public PaymentProcessed() {
        super();
    }
}
