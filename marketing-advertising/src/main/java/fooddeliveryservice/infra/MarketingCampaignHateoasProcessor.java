package fooddeliveryservice.infra;

import fooddeliveryservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MarketingCampaignHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MarketingCampaign>> {

    @Override
    public EntityModel<MarketingCampaign> process(
        EntityModel<MarketingCampaign> model
    ) {
        return model;
    }
}
