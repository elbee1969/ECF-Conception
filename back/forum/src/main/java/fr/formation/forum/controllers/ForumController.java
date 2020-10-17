package fr.formation.forum.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.forum.dtos.ForumCreateDto;
import fr.formation.forum.dtos.ForumViewDto;
import fr.formation.forum.dtos.ReponseViewDto;
import fr.formation.forum.dtos.ReponseCreateDto;
import fr.formation.forum.dtos.SujetCreateDto;
import fr.formation.forum.dtos.SujetViewDto;
import fr.formation.forum.services.ForumService;
import fr.formation.forum.services.ReponseService;
import fr.formation.forum.services.SujetService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/forum")
public class ForumController {
	
	private final ForumService forumService;
	private final SujetService sujetService;
	private final ReponseService reponseService;
	
	public ForumController(ForumService forumService, SujetService sujetService, ReponseService reponseService) {
		this.forumService = forumService;
		this.sujetService = sujetService;
		this.reponseService = reponseService;
	}
	
	@PostMapping // POST "/api/forum" avec un JSON dans le corps de la requête
	public void create(@RequestBody ForumCreateDto dto) {
		forumService.create(dto);
	}
	@PostMapping("/sujet") // POST "/api/forum/sujet" avec un JSON dans le corps de la requête
	public void create(@RequestBody @Valid SujetCreateDto dto) {
		sujetService.create(dto);
	}
	@PostMapping("/reponse") // POST "/api/forum/reponse" avec un JSON dans le corps de la requête
	public void create(@RequestBody @Valid ReponseCreateDto dto) {
		reponseService.create(dto);
	}
	@GetMapping("/{id}") // GET "/api/forum/1" ou 1 correspond à l'id d'un forum existant en bdd
	public ForumViewDto getOne(@PathVariable Long id) {
		return forumService.getOne(id);
	}
	@GetMapping("/sujet/{id}") // GET "/api/forum/sujet/1" ou 1 correspond à l'id d'un sujet du forum existant en bdd
	public SujetViewDto getSujet(@PathVariable Long id) {
		return sujetService.getOne(id);
	}
	
	@GetMapping("/reponses") // GET "/api/forum/reponses" pas d'id, retourne toute la collection des réponces (posts)
	public List<ReponseViewDto> getAll() {
		return reponseService.getAll();
	}
}
