package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="owners")
public class Owner extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="addres")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="telephone")
	private String telephone;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();
	
	@Builder
	public Owner(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
		super(id, firstName, lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		
		if(pets != null) {
            this.pets = pets;
        }
	}
	
	/*-
	public Owner() {
		super();
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	*/
	@Override
	public String toString() {
		return "Owner [address=" + address + ", city=" + city + ", telephone=" + telephone + ", pets=" + pets
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getId()=" + getId()
				+ "]";
	}
}
