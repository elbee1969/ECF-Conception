package fr.formation.forum.services;

import javax.validation.Valid;

import fr.formation.forum.dtos.ForumCreateDto;
import fr.formation.forum.dtos.ForumViewDto;

public interface ForumService {

	void create(@Valid ForumCreateDto dto);

	ForumViewDto getOne(Long id); 

}
