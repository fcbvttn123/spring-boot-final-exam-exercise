package ca.sheridancollege.vutran.bootstrap;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.services.PostService;

@Component
public class PostBootstrap implements CommandLineRunner {
	
	@Autowired PostService ps;

	@Override
	public void run(String... args) throws Exception {

		Post p1 = new Post("David", "David Post's Content", LocalDate.of(2024, 4, 15), LocalTime.of(11, 0, 0));
		Post p2 = new Post("John", "John Post's Content", LocalDate.of(2024, 4, 15), LocalTime.of(12, 0, 0));
		
		ps.save(p2);
		ps.save(p1);
		
	}

}
