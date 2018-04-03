package com.example.awsbuddy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.awsbuddy.web.i18n.I18nService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AwsbuddyApplicationTests {

	@Autowired
	private I18nService i18nService;
	
	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18nService.getMessage(messageId);
		Assert.assertEquals("Expected does not match Actual",expectedResult,actual);
	}
	
	
}
