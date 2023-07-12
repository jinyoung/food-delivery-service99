package fooddeliveryservice.domain;

import fooddeliveryservice.MarketingAdvertisingApplication;
import fooddeliveryservice.domain.ServicePromoted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MarketingCampaign_table")
@Data
public class MarketingCampaign {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)

    private String campaignId;

    private String campaignType;

    @PostPersist
    public void onPostPersist() {
        ServicePromoted servicePromoted = new ServicePromoted(this);
        servicePromoted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static MarketingCampaignRepository repository() {
        MarketingCampaignRepository marketingCampaignRepository = MarketingAdvertisingApplication.applicationContext.getBean(
            MarketingCampaignRepository.class
        );
        return marketingCampaignRepository;
    }
}
