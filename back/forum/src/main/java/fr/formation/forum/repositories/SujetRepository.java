package fr.formation.forum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.forum.dtos.SujetViewDto;
import fr.formation.forum.entities.Sujet;

public interface SujetRepository extends JpaRepository<Sujet, Long> {

	SujetViewDto getById(Long id);
	
	SujetViewDto findByTitle(String title);
}
