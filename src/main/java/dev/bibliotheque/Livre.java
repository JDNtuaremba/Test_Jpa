package dev.bibliotheque;

import javax.persistence.*;

@Entity
@Table(name="Livre")
public class Livre {

	
	@Id
	private Integer id;
	@Column(name = "TITRE", length = 255, nullable = false)
	private String Titre;
	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String Auteur;
	
	public Livre() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

	
}
