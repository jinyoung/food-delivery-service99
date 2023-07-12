package fooddeliveryservice.infra;

import fooddeliveryservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SystemManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SystemManagement>> {

    @Override
    public EntityModel<SystemManagement> process(
        EntityModel<SystemManagement> model
    ) {
        return model;
    }
}
