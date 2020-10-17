package fr.formation.forum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.forum.dtos.ForumViewDto;
import fr.formation.forum.entities.Forum;

public interface ForumRepository extends JpaRepository<Forum, Long> {
	ForumViewDto getById(Long id);
	
	ForumViewDto findByName(String name);
}
