package ts.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name = "persons")
public class Person {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "personid")
	private long personId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "postcode")
	private int postcode;
	
	@Column(name = "houseHumber")
	private Integer houseNumber;
	
	@Column(name = "country")
	private String country;
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "users_userid")
	private User user;

}
