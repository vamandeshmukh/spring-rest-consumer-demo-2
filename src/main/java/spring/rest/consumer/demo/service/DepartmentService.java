package spring.rest.consumer.demo.service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import spring.rest.consumer.demo.model.Department;

@Service
public class DepartmentService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	private final RestTemplateBuilder rtb = new RestTemplateBuilder();
	private final RestTemplate restTemplate = rtb.build();

	private String URL = "http://localhost:9999";

	private HttpHeaders headers = new HttpHeaders();

	public Department getDepartmentById(int did) {
		headers.add("Authorization", "Basic user:password");
		Department department = restTemplate.getForObject(URL + "/dept/get-dept-by-id/" + did, Department.class,
				headers);
//		Department department = restTemplate.getForObjec
//		restTemplate.
		LOG.info(department.toString());
		return department;
	}

}
