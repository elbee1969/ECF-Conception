package fr.formation.forum.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import fr.formation.forum.dtos.SujetCreateDto;
import fr.formation.forum.dtos.SujetViewDto;
import fr.formation.forum.entities.Forum;
import fr.formation.forum.entities.Sujet;
import fr.formation.forum.repositories.ForumRepository;
import fr.formation.forum.repositories.SujetRepository;

@Service
public class SujetServiceImpl implements SujetService {

	private final SujetRepository sujetRepo;
	private final ForumRepository forumRepo;

	protected SujetServiceImpl(SujetRepository sujetRepo, ForumRepository forumRepo) {
		this.sujetRepo = sujetRepo;
		this.forumRepo = forumRepo;
	}

	@Override
	public void create(@Valid SujetCreateDto dto) {
		// TODO Auto-generated method stub
		Sujet sujet = new Sujet();
		populateAndSave(dto, sujet);

	}

	private void populateAndSave(@Valid SujetCreateDto dto, Sujet sujet) {
		// TODO Auto-generated method stub
		sujet.setTitle(dto.getTitle());
		sujet.setNickname(dto.getNickname());
		sujet.setLanguage(dto.getLanguage());
		sujet.setDescription(dto.getDescription());
		sujet.setCode(dto.getCode());
		Long forumId = dto.getForumId();
		Forum forum = forumRepo.getOne(dto.getForumId());
		sujet.setForum(forum);
		sujetRepo.save(sujet);
	}

	@Override
	public SujetViewDto getOne(Long id) {
		// TODO Auto-generated method stub
		return sujetRepo.getById(id);
	}

}
