package fooddeliveryservice.common;

import fooddeliveryservice.MarketingAdvertisingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MarketingAdvertisingApplication.class })
public class CucumberSpingConfiguration {}
