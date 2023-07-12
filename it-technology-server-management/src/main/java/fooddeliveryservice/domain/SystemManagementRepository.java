package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="systemManagements", path="systemManagements")
public interface SystemManagementRepository extends PagingAndSortingRepository<SystemManagement, >{

}
