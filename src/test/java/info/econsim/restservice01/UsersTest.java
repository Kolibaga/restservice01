package info.econsim.restservice01;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import info.econsim.restservice01.data.User;
import info.econsim.restservice01.service.Users;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersTest {

	@Autowired
	Users usersRepository;

	User dave, oliver, carter;

	@Before
	public void setUp() {

		usersRepository.deleteAll();

		dave = usersRepository.save(new User("Dave", "Matthews"));
		oliver = usersRepository.save(new User("Oliver August", "Matthews"));
		carter = usersRepository.save(new User("Carter", "Beauford"));
	}

	@Test
	public void setsIdOnSave() {

		User dave = usersRepository.save(new User("Dave", "Matthews"));

		assertThat(dave.id).isNotNull();
	}

	@Test
	public void findsByLastName() {

		List<User> result = usersRepository.findByLastName("Beauford");

		assertThat(result).hasSize(1).extracting("firstName").contains("Carter");
	}

	@Test
	public void findsByExample() {

		User probe = new User(null, "Matthews");

		List<User> result = usersRepository.findAll(Example.of(probe));

		assertThat(result).hasSize(2).extracting("firstName").contains("Dave", "Oliver August");
	}
}