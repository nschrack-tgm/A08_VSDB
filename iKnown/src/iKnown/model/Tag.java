package iKnown.model;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Id;
import javax.persistence.Entity;

import java.util.List;

@Entity
public class Tag {

	@Id
	private String stichwort;

	@ManyToMany
	@JoinTable(
			name = "BEITRAG_TAG",
			joinColumns = {@JoinColumn(name = "T_STICHWORT", referencedColumnName = "stichwort")},
			inverseJoinColumns = {@JoinColumn(name = "B_TITEL", referencedColumnName = "titel")}
	)
	private List<Beitrag> beitraege;

	public Tag(String stichwort) {
		this.stichwort = stichwort;
	}

	public Tag() {
	}

	public String getStichwort() {
		return stichwort;
	}

	public void setStichwort(String stichwort) {
		this.stichwort = stichwort;
	}
}
