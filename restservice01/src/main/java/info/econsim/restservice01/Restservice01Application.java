package info.econsim.restservice01;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Restservice01Application {

    static final Logger logger = LogManager.getLogger(Restservice01Application.class); 
    
	public static void main(String[] args) {
		SpringApplication.run(Restservice01Application.class, args);
	}
}