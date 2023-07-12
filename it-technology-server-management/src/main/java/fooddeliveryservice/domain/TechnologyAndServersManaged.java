package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import fooddeliveryservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class TechnologyAndServersManaged extends AbstractEvent {

    public TechnologyAndServersManaged(SystemManagement aggregate) {
        super(aggregate);
    }

    public TechnologyAndServersManaged() {
        super();
    }
}
