package models.budget.transaction;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

import models.budget.Amount;

@Entity
public class SubTransaction extends Model {
	@Embedded
	public Amount amount;
	@ManyToOne
	public Transaction transaction;

}
