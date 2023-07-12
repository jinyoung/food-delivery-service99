package fooddeliveryservice.infra;

import fooddeliveryservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerInquiryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerInquiry>> {

    @Override
    public EntityModel<CustomerInquiry> process(
        EntityModel<CustomerInquiry> model
    ) {
        return model;
    }
}
