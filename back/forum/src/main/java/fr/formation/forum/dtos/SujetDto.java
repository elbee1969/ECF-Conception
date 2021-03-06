package fr.formation.forum.dtos;

import java.util.List;

import javax.validation.constraints.NotEmpty;

public class SujetDto {
	
	@NotEmpty
	private String title;

	@NotEmpty
	private String nickname;
		
	@NotEmpty
	private String language;
	
	@NotEmpty
	private String description;
	
	@NotEmpty
	private String code;
	
    private ForumDto forum;
	
    private List<ReponseCreateDto> reponses;

	public SujetDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String titre) {
		this.title = titre;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
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

	public ForumDto getForum() {
		return forum;
	}

	public void setForum(ForumDto forum) {
		this.forum = forum;
	}

	public List<ReponseCreateDto> getReponses() {
		return reponses;
	}

	public void setReponses(List<ReponseCreateDto> reponses) {
		this.reponses = reponses;
	}

    
}
