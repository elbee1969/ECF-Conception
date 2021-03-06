package fr.formation.forum.dtos;

import javax.validation.constraints.Size;

public class ReponseCreateDto {
	
	@Size(min = 1, max = 45)
	private String nickname;
	
	@Size(min = 1, max = 255)
	private String description;
	
	@Size(min = 1, max = 255)
	private String code;	
	

    private Long sujetId; 

	public ReponseCreateDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public Long getSujetId() {
		return sujetId;
	}


	public void setSujetId(Long sujetId) {
		this.sujetId = sujetId;
	}

	
	
}
