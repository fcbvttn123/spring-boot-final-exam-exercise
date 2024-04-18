package ca.sheridancollege.vutran.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired PostRepository pr;

	@Override
	public List<Post> findAll() {
		return pr.findAllByOrderByCreatedTimeAsc();
	}

	@Override
	public Post findById(Long id) {
		return pr.findById(id).get();
	}

	@Override
	public Post save(Post p) {
		p.setCreatedDate(LocalDate.now());
		p.setCreatedTime(LocalTime.now());
		return pr.save(p);
	}

}
