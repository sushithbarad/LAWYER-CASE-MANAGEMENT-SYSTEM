package org.jsp.manytomany_ui.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Lawyer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String name;
	private String experience;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Cases> cases;

	public List<Cases> getCases() {
		return cases;
	}

	public void setCases(List<Cases> cases) {
		this.cases = cases;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	

}
