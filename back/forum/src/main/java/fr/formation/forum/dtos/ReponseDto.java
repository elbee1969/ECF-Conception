package fr.formation.forum.dtos;

import javax.validation.constraints.NotEmpty;

public class ReponseDto {
	
	@NotEmpty
	private String nickname;
	
	@NotEmpty
	private String description;
	
	@NotEmpty
	private String code;	
	
	@NotEmpty
    private SujetDto sujet;

	public ReponseDto() {
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


	public SujetDto getSujet() {
		return sujet;
	}


	public void setSujet(SujetDto sujet) {
		this.sujet = sujet;
	}
	

}
