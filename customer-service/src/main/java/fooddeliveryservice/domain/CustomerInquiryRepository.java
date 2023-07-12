package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "customerInquiries",
    path = "customerInquiries"
)
public interface CustomerInquiryRepository
    extends PagingAndSortingRepository<CustomerInquiry, String> {}
