package ts.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "events")
public class Event {
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "eventId")
	private long eventId;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "description")
	private String description;
	
	@Column (name = "ticketamount")
	private int ticketAmount;
	
	@Column (name = "soldtickets")
	private int soldTickets;
	
	@Column (name = "status")
	private int status;
	
	@Column (name = "eventdate")
	private Date eventDate;
	
	@Column (name = "beginndate")
	private Date beginDate;
	
	@Column (name = "enddate")
	private Date endDate;
	
	@Column (name = "viewings")
	private int viewings;
	
	@Column (name = "rating")
	private float rating;
	
	
}

