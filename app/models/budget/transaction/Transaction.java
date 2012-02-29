package models.budget.transaction;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import models.budget.Amount;

import org.joda.time.LocalDate;

import play.db.jpa.Model;

@Entity
public class Transaction extends Model {
	
	public LocalDate date;
	public Amount amount;
	public String details;
	
	@OneToMany
	public List<SubTransaction> splitTransactions; 

}
