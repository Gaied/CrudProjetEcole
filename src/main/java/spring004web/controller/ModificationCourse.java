package spring004web.controller;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class ModificationCourse {

	private Integer id;
	private String libelle;
	@NotEmpty(message = "{modification.course.quantite.notempty}")
	@Pattern(regexp = "\\d*", message = "{modification.course.quantite.numerique}")
	private String quantite;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

}
