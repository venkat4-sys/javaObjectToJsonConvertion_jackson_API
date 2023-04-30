package com.ait.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConvertion {

	public static void main(String[] args) throws Exception {
		
		
		//source file
		File f=new File("customer.json");
		
		ObjectMapper mapper =new ObjectMapper();
		//convertion of json to java object
		Customer c = mapper.readValue(f, Customer.class);
		
		System.out.println(c);

	}

}
