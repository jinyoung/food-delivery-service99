package fooddeliveryservice.common;

import fooddeliveryservice.ItTechnologyServerManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ItTechnologyServerManagementApplication.class })
public class CucumberSpingConfiguration {}
