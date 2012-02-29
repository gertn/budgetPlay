package models.budget;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Embeddable;

import org.apache.commons.lang.NotImplementedException;

@Embeddable
public class Amount {
	
	public static Amount zero() {
		Amount amount = new Amount();
		amount.value = BigDecimal.ZERO;
		return amount;
	}
	
	public static Amount of(double amount) {
		Amount result = new Amount();
		result.value = BigDecimal.valueOf(amount);
		return result;
	}
	
	public BigDecimal value;

	public void setValue(BigDecimal value) {
		this.value = rounded(value);
	}

	public Amount add(Amount amount) {
		Amount result = new Amount();
		result.value = rounded(this.value.add(amount.value));
		return result;
	}
	
	private BigDecimal rounded(BigDecimal aNumber){
	    return aNumber.setScale(2, RoundingMode.HALF_EVEN);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Amount other = (Amount) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Amount [value=" + value + "]";
	}
	
}
