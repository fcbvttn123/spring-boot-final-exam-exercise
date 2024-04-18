package ca.sheridancollege.vutran.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.vutran.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	public List<Post> findAllByOrderByCreatedTimeAsc();
}
