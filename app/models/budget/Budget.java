package models.budget;

import java.util.List;

import models.budget.category.Category;
import play.db.jpa.Model;

public class Budget extends Model {
	
	public Integer year;
	public String name;
	public List<Category> incomeCategories;
	public List<Category> expenseCategories;

}
