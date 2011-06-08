package ts.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name = "tickets")
public class Ticket {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ticketID")
	private long ticketId;
	
	@Column (name = "bookingDate")
	private Date bookingDate;
	
	@Column (name = "place")
	private int place;
	
	@Column (name = "pries") 
	private double preis;
	
	
	
	@ManyToOne (cascade = (CascadeType.REFRESH), fetch = FetchType.LAZY)
	/*  CascadeType.REFRESH
	 *  When we refresh an entity, all the entities held in this field refresh too.
	 *  
	 *  FetchType.LAZY
	 *  The LAZY strategy is a hint to the persistence provider runtime that 
	 *  data should be fetched lazily when it is first accessed
	 */
	
	
	@JoinColumn (name = "users_userid")
	private User user;
	
	@ManyToOne (cascade = (CascadeType.REFRESH), fetch = FetchType.LAZY)
	@JoinColumn (name = "events_eventid")
	private Event event;
	
	
	
}
