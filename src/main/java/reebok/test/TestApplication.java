package reebok.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Computer computer = context.getBean(Computer.class);
		Serializator serializator = context.getBean(SerializatorXML.class);
		//Serializator serializator = context.getBean(SerializatorJSON.class);
		//Serializator serializator = context.getBean(SerializatorYAML.class);
		serializator.serialize(computer);

	}
}