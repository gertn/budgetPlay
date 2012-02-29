package models.budget;

import java.math.BigDecimal;

import org.fest.assertions.Assertions;
import org.junit.Test;

import play.test.UnitTest;

public class AmountTest extends UnitTest {
	@Test
	public void shouldBeAbleToRoundedHalfEven(){
		Assertions.assertThat(Amount.of(1.055)).isEqualTo(Amount.of(1.06));
		Assertions.assertThat(Amount.of(1.025)).isEqualTo(Amount.of(1.02));
		Assertions.assertThat(Amount.of(1.016)).isEqualTo(Amount.of(1.02));
		Assertions.assertThat(Amount.of(1.011)).isEqualTo(Amount.of(1.01));
		Assertions.assertThat(Amount.of(1.010)).isEqualTo(Amount.of(1.01));
	}

	@Test
	public void shouldBeAbleToAdd() {
		Amount result = Amount.of(15.55).add(Amount.of(14.45));
		
		Assertions.assertThat(result).isEqualTo(Amount.of(30));
	}

}
