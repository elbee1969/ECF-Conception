package fr.formation.forum.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sujet")
public class Sujet extends AbstractEntity {
	
	@Column(name = "title", length = 45, nullable = false)
	private String title;
	
	@Column(name = "nickname", length = 45, nullable = false)
	private String nickname;
		
	@Column(name = "language", length = 45, nullable = false)
	private String language;
	
	@Column(name = "description", length = 255, nullable = false)
	private String description;
	
	@Column(name = "code", length = 255, nullable = false)
	private String code;
//	(optional = true)
	
	@ManyToOne
    @JoinColumn(name = "forum_id")
    private Forum forum;
	
	@OneToMany(mappedBy = "sujet", cascade = CascadeType.ALL)
    private List<Reponse> reponses = new ArrayList<>();

	public Sujet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sujet(Long id) {
		super(id);
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

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}

	
}
