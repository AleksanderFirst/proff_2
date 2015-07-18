package shop.domain;

public class Warehouse {
	private long supplier_id;
	private long good_id;
	private int good_qty;

	public Warehouse(String Name, String Supplier_Name,int qty) {
		// TODO Auto-generated constructor stub
	}

	public long getSupplier_id() {
		return supplier_id;
	}

	@SuppressWarnings("unused")
	private void setSupplier_id(long supplier_id) {
		this.supplier_id = supplier_id;
	}

	public int getGood_qty() {
		return good_qty;
	}

	@SuppressWarnings("unused")
	private void setGood_qty(int good_qty) {
		this.good_qty = good_qty;
	}

	public long getGood_id() {
		return good_id;
	}

	@SuppressWarnings("unused")
	private void setGood_id(long good_id) {
		this.good_id = good_id;
	}
}
