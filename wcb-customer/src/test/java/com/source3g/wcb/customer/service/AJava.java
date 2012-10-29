package com.source3g.wcb.customer.service;

import java.io.IOException;

import org.bson.types.ObjectId;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.source3g.wcb.entity.customer.Customer;

public class AJava {

	
	@Test
	public void testJson() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper obj=new ObjectMapper();
 		obj.getSerializationConfig().setSerializationInclusion(org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.NON_NULL);
//		obj.getSerializationConfig().withSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
//		obj.configure(Feature.WRITE_NULL_PROPERTIES, false);
		Customer c=new Customer();
		c.setId(new ObjectId());
		c.setName("jqk");
		System.out.println(obj.writeValueAsString(c));
	}
}
