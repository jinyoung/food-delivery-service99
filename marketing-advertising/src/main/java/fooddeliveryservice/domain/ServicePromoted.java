package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import fooddeliveryservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ServicePromoted extends AbstractEvent {

    public ServicePromoted(MarketingCampaign aggregate) {
        super(aggregate);
    }

    public ServicePromoted() {
        super();
    }
}
