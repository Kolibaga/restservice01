package info.econsim.restservice01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Restservice01Application {

    static final Logger logger = LoggerFactory.getLogger(Restservice01Application.class); 
    
	public static void main(String[] args) {
		SpringApplication.run(Restservice01Application.class, args);
	}
}
