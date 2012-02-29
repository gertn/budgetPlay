package models.budget.category;

import static org.junit.Assert.*;

import java.util.ArrayList;

import models.budget.Amount;
import models.budget.category.Month.January;
import models.budget.transaction.SubTransaction;

import org.fest.assertions.Assertions;
import org.junit.Test;

import play.test.UnitTest;

public class MonthTest extends UnitTest {

	@Test
	public void shouldBeAbleToDetermineActualAmount() {
		Assertions.assertThat(new Month.January().getActualAmount()).isEqualTo(Amount.zero());
		
		Month month = new Month.January();
		SubTransaction transaction1 = new SubTransaction();
		transaction1.amount = Amount.of(150);
		SubTransaction transaction2 = new SubTransaction();
		transaction2.amount = Amount.of(50);
		
		month.addTransaction(transaction1);
		month.addTransaction(transaction2);
		
		Assertions.assertThat(month.getActualAmount()).isEqualTo(Amount.of(200));
	}
	
}
