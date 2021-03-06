package fr.formation.forum.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reponse")
public class Reponse extends AbstractEntity{
	
	
	@Column(name = "nickname", length = 45, nullable = false)
	private String nickname;
	
	@Column(name = "description", length = 255, nullable = false)
	private String description;
	
	@Column(name = "code", length = 255, nullable = false)
	private String code;	
	
//	(optional = true)
	@ManyToOne
    @JoinColumn(name = "sujet_id")
    private Sujet sujet;


	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reponse(Long id) {
		super(id);
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


	public Sujet getSujet() {
		return sujet;
	}


	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}


	
	

}
