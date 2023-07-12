package fooddeliveryservice.common;

import fooddeliveryservice.DeliveryManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryManagementApplication.class })
public class CucumberSpingConfiguration {}
