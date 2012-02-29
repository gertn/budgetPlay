package models.budget.category;

import java.util.Map;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.google.common.collect.ImmutableMap;

import models.budget.Amount;
import static models.budget.category.Month.*;

@Embeddable
public class Year {

	public Month january = new January();
	public Month february = new February();
	public Month march = new March();
	public Month april = new April();
	public Month may = new May();
	public Month june = new June();
	public Month july = new July();
	public Month august = new August();
	public Month september = new September();
	public Month october = new October();
	public Month november = new November();
	public Month december = new December();
	
	@Transient
	private ImmutableMap<Integer, Month> months;

	public Amount getTotalBudget() {
		return january.budgetAmount.add(february.budgetAmount).add(march.budgetAmount).add(april.budgetAmount).add(may.budgetAmount).add(june.budgetAmount)
				.add(july.budgetAmount).add(august.budgetAmount).add(september.budgetAmount).add(october.budgetAmount)
				.add(november.budgetAmount).add(december.budgetAmount);
	}
	
	private ImmutableMap<Integer, Month> getMonths() {
		if(months == null){
			months = ImmutableMap.<Integer, Month>builder()
					.put(1, january)
					.put(2, february)
					.put(3, march)
					.put(4, april)
					.put(5, may)
					.put(6, june)
					.put(7, july)
					.put(8, august)
					.put(9, september)
					.put(10, october)
					.put(11, november)
					.put(12, december)
					.build();
		}
		return months;
	}

}
