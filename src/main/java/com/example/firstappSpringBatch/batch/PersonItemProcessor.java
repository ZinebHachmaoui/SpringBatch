package com.example.firstappSpringBatch.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.example.firstappSpringBatch.model.Person;

public class PersonItemProcessor implements ItemProcessor<Person, String> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonItemProcessor.class);
	
	@Override
	public String process(Person person) throws Exception {
		String greeting = "Hello " + person.getFirstName() + " "
				+ person.getLastName() + "!";
		
		LOGGER.info("converting '{}' into '{}'", person, greeting);
		
		return greeting;
	}

}
