package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import fooddeliveryservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InquiryHandled extends AbstractEvent {

    public InquiryHandled(CustomerInquiry aggregate) {
        super(aggregate);
    }

    public InquiryHandled() {
        super();
    }
}
