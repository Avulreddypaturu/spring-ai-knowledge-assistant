package com.gh.ai.knowledgeassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringAiKnowledgeAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiKnowledgeAssistantApplication.class, args);
	}

}
