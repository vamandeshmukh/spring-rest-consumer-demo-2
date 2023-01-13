package spring.rest.consumer.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import spring.rest.consumer.demo.model.Employee;

@FeignClient(value = "empClient", url = "http://localhost:9090/", name = "empClient", configuration = FeignClientConfiguration.class)
public interface EmpClient {

	@RequestMapping(method = RequestMethod.GET, value = "/emp/get-all-emps", produces = "application/json")
	public abstract List<Employee> getAllEmps();

	@RequestMapping(method = RequestMethod.GET, value = "/emp/get-emp-by-id/{employeeId}", produces = "application/json")
	public abstract Employee getEmpById(@PathVariable("employeeId") int employeeId);

	@RequestMapping(method = RequestMethod.POST, value = "/emp/add-emp", consumes = "application/json", produces = "application/json")
	public abstract Employee addEmp(@RequestBody Employee employee);

	@RequestMapping(method = RequestMethod.GET, value = "hello")
	public String hello();
}