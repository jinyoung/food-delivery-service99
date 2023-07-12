package fooddeliveryservice.common;

import fooddeliveryservice.OrderAndPaymentApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderAndPaymentApplication.class })
public class CucumberSpingConfiguration {}
