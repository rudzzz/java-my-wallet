package com.dev.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class MessageServices {
	
	@Value("${application.name}")
	private String appname;
}
