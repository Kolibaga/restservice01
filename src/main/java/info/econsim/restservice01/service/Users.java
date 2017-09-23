package info.econsim.restservice01.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import info.econsim.restservice01.data.User;

public interface Users  extends MongoRepository<User, String> {

    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);

}