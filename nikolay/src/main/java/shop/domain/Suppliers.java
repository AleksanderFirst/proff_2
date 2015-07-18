package shop.domain;

public class Suppliers {
	private String supplier_name;
	private String phone;

	public Suppliers(String Name, String phone) {
		setSupplier_name(Name);
		if(phone.length()<15) {
			setPhone(phone);
		}else{throw new IllegalArgumentException();}
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	private void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getPhone() {
		return phone;
	}

	private void setPhone(String phone) {
		this.phone = phone;
	}

}
