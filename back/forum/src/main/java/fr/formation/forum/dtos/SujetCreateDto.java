package fr.formation.forum.dtos;

import java.util.List;

import javax.validation.constraints.Size;

public class SujetCreateDto {
	
	@Size(min = 1, max = 45)
	private String title;
	
	@Size(min = 1, max = 45)
	private String nickname;
	
	@Size(min = 1, max = 45)
	private String language;
	
	@Size(min = 1, max = 255)
	private String description;
	
	@Size(min = 1, max = 255)
	private String code;
	
    private Long forumId;
	
    private List<ReponseCreateDto> reponses;

	public SujetCreateDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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



	public Long getForumId() {
		return forumId;
	}


	public void setForumId(Long forumId) {
		this.forumId = forumId;
	}


	public List<ReponseCreateDto> getReponses() {
		return reponses;
	}

	public void setReponses(List<ReponseCreateDto> reponses) {
		this.reponses = reponses;
	}

}
