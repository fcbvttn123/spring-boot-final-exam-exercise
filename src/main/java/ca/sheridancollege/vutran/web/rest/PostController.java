package ca.sheridancollege.vutran.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.services.PostService;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
	
	@Autowired PostService ps;
	
	@GetMapping(value = {"", "/"})
	public List<Post> readAllPosts() {
		return ps.findAll();
	}
	
    @PostMapping(value = {"", "/"})
    public Post createPost(@RequestBody Post p) {
    	return ps.save(p);
    }

}
