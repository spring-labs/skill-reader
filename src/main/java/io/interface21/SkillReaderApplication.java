package io.interface21;

import static java.util.stream.Collectors.joining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SkillReaderApplication {

	@Autowired
	private ConnectionRepository connectionRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String pingLinkedin() {
		Connection<LinkedIn> connection = connectionRepository.getPrimaryConnection(LinkedIn.class);
		if (connection != null) {
			LinkedIn linkedin = connection.getApi();
			return linkedin.profileOperations().getUserProfileFull().getSkills().stream().map(i -> i).collect(joining(","));

		}
		return "nix wars";
	}

	public static void main(String[] args) {
		SpringApplication.run(SkillReaderApplication.class, args);
	}
}
