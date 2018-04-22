package info.econsim.restservice01.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import info.econsim.restservice01.data.EsUser;
import info.econsim.restservice01.service.Users;

@Controller
@RequestMapping(path="/es1")
public class StaticContentController {

	static final Logger logger = LoggerFactory.getLogger(StaticContentController.class);
	@Autowired
	private Users users;
	
	@GetMapping("/add")
	public @ResponseBody String es1(@RequestParam String name,
			@RequestParam String email)  {
		logger.info("es1");
		EsUser n = new EsUser();
		n.setName(name);
		n.setEmail(email);
		users.save(n);		
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<EsUser> getAllUsers() {
		// This returns a JSON or XML with the users
		return users.findAll();
	}

}
