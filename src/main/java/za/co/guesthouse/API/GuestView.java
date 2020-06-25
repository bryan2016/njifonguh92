package za.co.guesthouse.API;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GuestView")
public class GuestView {
	@Id
	@Column(name="id")
	private String id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private int phone;
	@Column(name="roomAva")
	private String roomAva;


	public GuestView(String string, String string2, String string3) {
		super();
	}


	public GuestView(String id, String firstName, String lastName, String address, int phone, String roomAva) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.roomAva = roomAva;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getRoomAva() {
		return roomAva;
	}


	public void setRoomAva(String roomAva) {
		this.roomAva = roomAva;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + phone;
		result = prime * result + ((roomAva == null) ? 0 : roomAva.hashCode());
		return result;
	}



	@Override
	public String toString() {
		return "Guestview [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", phone=" + phone + ", roomAva=" + roomAva + "]";
	}

}
