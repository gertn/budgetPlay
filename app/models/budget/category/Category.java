package models.budget.category;

import javax.persistence.Embedded;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

public class Category extends Model {
	
	public String name;
	@Embedded
	public Year year;
	@ManyToOne
	public CategoryGroup group;

}
