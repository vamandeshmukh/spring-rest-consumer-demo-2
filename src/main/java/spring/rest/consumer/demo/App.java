package spring.rest.consumer.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

@SpringBootApplication
@EnableFeignClients
//@EnableEurekaClient
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		App.log.info("Starting");
		SpringApplication.run(App.class, args);
		App.log.info("Started");

	}
}
