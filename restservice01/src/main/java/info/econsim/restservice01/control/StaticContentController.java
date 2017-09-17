package info.econsim.restservice01.control;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class StaticContentController {

	static final Logger logger = LogManager.getLogger(StaticContentController.class);
	@GetMapping("/es1")
	public String es1(Model model) throws JsonProcessingException {
		logger.info("es1");
		return "t1";
	}

}
