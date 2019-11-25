package com.invoice.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.invoice.domain.Person;


public class Reader implements ItemReader<Person>{

	private String[] messages = {"Hello World!", "Welcome to Spring Batch!"};
	
	private int count=0;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public Person read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		if(count < messages.length){
			count++;
			return new Person("Annad", "Gajjar");	
			
		}else{
			count=0;
		}
		return null;
	}
	
}