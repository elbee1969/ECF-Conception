package fr.formation.forum.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.forum.dtos.ReponseViewDto;
import fr.formation.forum.entities.Reponse;

public interface ReponseRepository extends JpaRepository<Reponse, Long> {
	
	ReponseViewDto getById(Long id);
	
	ReponseViewDto findByNickname(String nickname);

	List<ReponseViewDto> getAllProjectedBy();

}
