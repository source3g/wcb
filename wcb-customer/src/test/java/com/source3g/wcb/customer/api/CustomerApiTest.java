package com.source3g.wcb.customer.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.source3g.wcb.entity.customer.Contact;
import com.source3g.wcb.entity.customer.Customer;
import com.source3g.wcb.enums.Sex;

//@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CustomerApiTest/* extends SpringTransactionalTestCase */{
	@Test
	public void testAdd() throws JsonGenerationException, JsonMappingException, IOException {
		String uri = "http://localhost:8080/api/customer/add";
		RestTemplate template = new RestTemplate();
		Customer customer = new Customer();
		customer.setName("li");
		customer.setSex(Sex.MALE);
		List<Contact> list = new ArrayList<Contact>();
		Contact contact = new Contact();
		contact.setMobilePhones(Arrays.asList("111", "222"));
		list.add(contact);
		Contact contact1 = new Contact();
		contact1.setMobilePhones(Arrays.asList("333", "444"));
		list.add(contact1);
		customer.setContact(list);
//		ObjectMapper mapper = new ObjectMapper();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		System.out.println(mapper.writeValueAsString(customer));
		HttpEntity<Customer> entity = new HttpEntity<Customer>(customer);

		String result = template.postForObject(uri, entity, String.class);
		System.out.println(result);
	}
	
	@Test
	public void testListAll(){
		String uri = "http://localhost:8080/api/customer/listAll";
		RestTemplate template = new RestTemplate();
//		List<Customer> customers=(List<Customer>)template.getForObject(uri,Object.class );
		Customer [] customers=template.getForObject(uri,Customer[].class);
		//Customer customer=customers.get(0);
		System.out.println(customers.length);
	}

}
