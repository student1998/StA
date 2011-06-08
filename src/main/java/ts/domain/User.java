package ts.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	
	//user id
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "userid")
	private long userId;
	
	//email is used as username
	@Column (name = "email")
	private String email;
	
	@Column (name = "password")
	private String password;
		
	
	@Column (name = "regDate")
	private Date regDate;
	
	/*
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="user")
	private List<Ticket> ticket;

	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="user")
	private List<Commentary> commentary;

	*/
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	/*
	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	public List<Commentary> getCommentary() {
		return commentary;
	}

	public void setCommentary(List<Commentary> commentary) {
		this.commentary = commentary;
	}
	
	*/

}
