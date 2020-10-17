package fr.formation.forum.services;

import java.util.List;

import javax.validation.Valid;


import fr.formation.forum.dtos.ReponseViewDto;
import fr.formation.forum.dtos.ReponseCreateDto;

public interface ReponseService {

	void create(@Valid ReponseCreateDto dto);



	List<ReponseViewDto> getAll();



}
