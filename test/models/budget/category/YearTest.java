package models.budget.category;

import models.budget.Amount;

import org.fest.assertions.Assertions;
import org.junit.Test;

import play.test.UnitTest;

public class YearTest extends UnitTest {
	
	@Test
	public void shouldBeAbleToCountTotalBudget(){
		Year year = new Year();
		
		year.january.budgetAmount = Amount.of(1.5);
		year.february.budgetAmount = Amount.of(2.5);
		year.march.budgetAmount = Amount.of(3.5);
		year.april.budgetAmount = Amount.of(4.5);
		year.may.budgetAmount = Amount.of(5.5);
		year.june.budgetAmount = Amount.of(6.5);
		year.july.budgetAmount = Amount.of(7.5);
		year.august.budgetAmount = Amount.of(8.5);
		year.september.budgetAmount = Amount.of(9.5);
		year.october.budgetAmount = Amount.of(10.5);
		year.november.budgetAmount = Amount.of(11.5);
		year.december.budgetAmount = Amount.of(12.5);
		
		Assertions.assertThat(year.getTotalBudget()).isEqualTo(Amount.of(84));
	}

}
