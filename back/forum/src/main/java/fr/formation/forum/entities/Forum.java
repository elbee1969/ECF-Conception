package fr.formation.forum.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "forum")
public class Forum extends AbstractEntity {
	
	  @Column(name = "name", length = 45, nullable = false)
	private String name;
	  
	  @OneToMany(mappedBy = "forum", cascade = CascadeType.ALL)
	    private List<Sujet> sujets = new ArrayList<>();

	public Forum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Forum(Long id) {
		super(id);
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


	

}
