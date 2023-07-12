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
    CustomerInquiryRepository customerInquiryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InquiryHandled'"
    )
    public void wheneverInquiryHandled_InquiryHandlingPolicy(
        @Payload InquiryHandled inquiryHandled
    ) {
        InquiryHandled event = inquiryHandled;
        System.out.println(
            "\n\n##### listener InquiryHandlingPolicy : " +
            inquiryHandled +
            "\n\n"
        );
        // Sample Logic //

    }
}
