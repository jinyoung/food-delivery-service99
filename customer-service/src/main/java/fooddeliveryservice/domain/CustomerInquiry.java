package fooddeliveryservice.domain;

import fooddeliveryservice.CustomerServiceApplication;
import fooddeliveryservice.domain.InquiryHandled;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CustomerInquiry_table")
@Data
public class CustomerInquiry {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)

    private String inquiryId;

    private String userId;

    private String inquiryType;

    @PostPersist
    public void onPostPersist() {
        InquiryHandled inquiryHandled = new InquiryHandled(this);
        inquiryHandled.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerInquiryRepository repository() {
        CustomerInquiryRepository customerInquiryRepository = CustomerServiceApplication.applicationContext.getBean(
            CustomerInquiryRepository.class
        );
        return customerInquiryRepository;
    }
}
