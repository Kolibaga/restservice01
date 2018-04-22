package info.econsim.restservice01;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import info.econsim.restservice01.data.EsUser;
import info.econsim.restservice01.service.Users;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersTest {

	@Autowired
	Users usersRepository;

	EsUser dummyUser;

	@Before
	public void setUp() {

		usersRepository.deleteAll();

		dummyUser = usersRepository.save(new EsUser("Dave", "Matthews"));
	}

	@Test
	public void setsIdOnSave() {

		EsUser dave = usersRepository.save(new EsUser("Dave", "Matthews"));

		assertThat(dave.id).isNotNull();
	}

	@Test
	public void findsByLastName() {

		Iterable<EsUser> result = usersRepository.findByEmail("ttt");

		assertThat(result).hasSize(1).extracting("name").contains("Carter");
	}

	@Test
	public void findsByExample() {

		EsUser probe = new EsUser(null, "Matthews");

		Iterable<EsUser> result = usersRepository.findAll();

		assertThat(result).hasSize(2).extracting("firstName").contains("Dave", "Oliver August");
	}
}