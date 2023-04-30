package com.ait.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws Exception{
	
		Address addr=new Address();
		addr.setCity("HYD");
		
		addr.setCountry("INDIA");
		
		addr.setState("TG");
		
		
       Customer c=new Customer();
       
       c.setId(1);
       c.setName("robert");
       c.setEmail("venkatkilari5@gmail.com");
       c.setPhno(341567342);
       c.setAddr(addr);
      //Object is a pre defined class        
       ObjectMapper mapper=new ObjectMapper();
       
       //target file,our java object
       mapper.writeValue(new File("customer.json"), c);
       
       
       System.out.println("json file created...");
	}

}
