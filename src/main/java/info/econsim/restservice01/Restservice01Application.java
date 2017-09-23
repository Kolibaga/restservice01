package info.econsim.restservice01;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class Restservice01Application {

    static final Logger logger = LogManager.getLogger(Restservice01Application.class); 
    
	public static void main(String[] args) {
		SpringApplication.run(Restservice01Application.class, args);
	}
}
