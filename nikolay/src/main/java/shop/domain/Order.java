package shop.domain;

public class Order {
	private int client_id;
	private int good_id;
	private int good_qty;

	public Order(int client_id, int good_id, int good_qty) {
		setClient_id(client_id);
		setGood_id(good_id);
		setGood_qty(good_qty);
	}

	public int getClient_id() {
		return client_id;
	}

	private void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public int getGood_id() {
		return good_id;
	}

	private void setGood_id(int good_id) {
		this.good_id = good_id;
	}

	public int getGood_qty() {
		return good_qty;
	}

	private void setGood_qty(int good_qty) {
		this.good_qty = good_qty;
	}

}
