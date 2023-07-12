package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "marketingCampaigns",
    path = "marketingCampaigns"
)
public interface MarketingCampaignRepository
    extends PagingAndSortingRepository<MarketingCampaign, String> {}
