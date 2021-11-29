package autowire;

public class Message {
	
	private Address address;

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public Message() {
		super();
	
}

	public Message(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Message [address=" + address + "]";
	}
	
}
