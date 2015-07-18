package shop.domain;

import java.math.BigDecimal;

public class Goods {
	private String good_name;
	private String description;
	private BigDecimal price;

	public Goods(String Name, String Description, BigDecimal Price) {
		setGood_name(Name);
		setDescription(Description);
		setPrice(Price);
	}

	public String getGood_name() {
		return good_name;
	}

	private void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	private void setPrice(BigDecimal price) {
		this.price = price;
	}

	
}
