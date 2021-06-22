package com.devsuperior.dslearnbds.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {

	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK(); // Chave primária de atributo de associação. Como foi criado, precisa ser instanciado
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment;
	private boolean available; // O tipo básico (com 'b' minúsculo) tem SOMENTE os valores TRUE e FALSE
	private boolean onlyUpdate; // O tipo wrapper ('B' maiúsculo) serve para o caso de ter TRUE, FALSE ou NULO
	
	@ManyToMany(mappedBy = "enrollmentsDone")
	private Set<Lesson> lessonsDone = new HashSet<>();
	
	@OneToMany(mappedBy = "enrollment")
	private List<Deliver> deliveries = new ArrayList<>();
	
	public Enrollment() {}

	// Foi alterado o id
	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available,
			boolean onlyUpdate) {
		id.setUser(user);
		id.setOffer(offer);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}

	// Alterando o GETTER e SETTER (boa prática)
	public User getStudent() {
		return id.getUser();
	}
	// Alterando o GETTER e SETTER (boa prática)	
	public void setStudent(User user) {
		id.setUser(user);
	}
	// Alterando o GETTER e SETTER (boa prática)
	public Offer getOffer() {
		return id.getOffer();
	}
	// Alterando o GETTER e SETTER (boa prática)
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}

	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public boolean isAvaiable() {
		return available;
	}

	public void setAvaiable(boolean available) {
		this.available = available;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}

	public List<Deliver> getDeliveries() {
		return deliveries;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollment other = (Enrollment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
