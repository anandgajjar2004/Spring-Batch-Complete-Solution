package com.invoice.job;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import com.invoice.domain.Person;

public class Writer implements ItemWriter<Person> {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void write(List<? extends Person> messages) throws Exception {
		for(Person person : messages){
			System.out.println("#Writer Step: " + person.getFirstName()+" / "+person.getLastName());
		}
	}
	
}