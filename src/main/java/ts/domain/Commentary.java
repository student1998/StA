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
@Table (name = "commentaries")
public class Commentary {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "commentaryId")
	private long commentaryId;
	
	@Column (name = "text")
	private String text;

	@Column (name = "date")
	private Date date;
	
	
	@ManyToOne (cascade = (CascadeType.REFRESH), fetch = FetchType.LAZY)
	@JoinColumn (name = "users_userid")
	private User user;
	
	
	@ManyToOne (cascade = (CascadeType.REFRESH), fetch = FetchType.LAZY)
	@JoinColumn (name = "events_eventid")
	private Event event;
	
}
