package fooddeliveryservice.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddeliveryservice.config.kafka.KafkaProcessor;
import fooddeliveryservice.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MarketingCampaignRepository marketingCampaignRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ServicePromoted'"
    )
    public void wheneverServicePromoted_ServicePromotionPolicy(
        @Payload ServicePromoted servicePromoted
    ) {
        ServicePromoted event = servicePromoted;
        System.out.println(
            "\n\n##### listener ServicePromotionPolicy : " +
            servicePromoted +
            "\n\n"
        );
        // Sample Logic //

    }
}
