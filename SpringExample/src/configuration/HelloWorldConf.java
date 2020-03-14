package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class HelloWorldConf {
@Bean
public HelloWorld helloworld() {
	return new HelloWorld();
}
@Bean
public Employee employee() {
	return new Employee("Swaroop","CEO");
}


}
