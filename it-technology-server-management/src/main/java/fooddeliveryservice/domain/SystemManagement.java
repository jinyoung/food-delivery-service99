package fooddeliveryservice.domain;

import fooddeliveryservice.ItTechnologyServerManagementApplication;
import fooddeliveryservice.domain.TechnologyAndServersManaged;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SystemManagement_table")
@Data
public class SystemManagement {

    @PostPersist
    public void onPostPersist() {
        TechnologyAndServersManaged technologyAndServersManaged = new TechnologyAndServersManaged(
            this
        );
        technologyAndServersManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SystemManagementRepository repository() {
        SystemManagementRepository systemManagementRepository = ItTechnologyServerManagementApplication.applicationContext.getBean(
            SystemManagementRepository.class
        );
        return systemManagementRepository;
    }
}
