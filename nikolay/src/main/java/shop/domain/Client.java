package shop.domain;

public class Client {
	private String first_name;
	private String second_name;
	private String email;

	public Client(String first_name,String second_name,String email) {
		setFirst_name(first_name);
		setSecond_name(second_name);
		setEmail(email);
	}

	public String getFirst_name() {
		return first_name;
	}

	private void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	private void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

}
