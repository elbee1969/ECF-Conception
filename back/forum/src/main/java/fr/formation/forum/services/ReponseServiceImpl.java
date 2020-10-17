package fr.formation.forum.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import fr.formation.forum.dtos.ReponseCreateDto;
import fr.formation.forum.dtos.ReponseViewDto;
import fr.formation.forum.entities.Reponse;
import fr.formation.forum.entities.Sujet;
import fr.formation.forum.repositories.ForumRepository;
import fr.formation.forum.repositories.ReponseRepository;
import fr.formation.forum.repositories.SujetRepository;

@Service
public class ReponseServiceImpl implements ReponseService {

	private final SujetRepository sujetRepo;
	private final ForumRepository forumRepo;
	private final ReponseRepository reponseRepo;

	protected ReponseServiceImpl(SujetRepository sujetRepo, ForumRepository forumRepo, ReponseRepository reponseRepo) {
		this.sujetRepo = sujetRepo;
		this.forumRepo = forumRepo;
		this.reponseRepo = reponseRepo;
	}

	@Override
	public void create(@Valid ReponseCreateDto dto) {
		// TODO Auto-generated method stub
		Reponse reponse = new Reponse();
		populateAndSave(dto, reponse);
	}

	private void populateAndSave(@Valid ReponseCreateDto dto, Reponse reponse) {
		// TODO Auto-generated method stub
		reponse.setNickname(dto.getNickname());
		reponse.setDescription(dto.getDescription());
		reponse.setCode(dto.getCode());
		Long sujetId = dto.getSujetId();
		Sujet sujet = sujetRepo.getOne(dto.getSujetId());
		reponse.setSujet(sujet);
		reponseRepo.save(reponse);
	}

	@Override
	public List<ReponseViewDto> getAll() {
		// TODO Auto-generated method stub
		return reponseRepo.getAllProjectedBy();
	}

}
