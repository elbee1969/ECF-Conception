package fr.formation.forum.dtos;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import fr.formation.forum.entities.Sujet;

public class ForumDto implements ForumViewDto {
	
    @NotEmpty
	private String name;
	  
	private List<Sujet> sujets;

	public ForumDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sujet> getSujets() {
		return sujets;
	}

	public void setSujets(List<Sujet> sujets) {
		this.sujets = sujets;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}