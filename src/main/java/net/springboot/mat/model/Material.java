package net.springboot.mat.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="material",schema="user")

public class Material {
	
	  @Id
	  @Column(name = "cartnumber")
	private String cartnumber;
	  @Column(name = "containerid")
	private String containerid;
	  @Column(name = "dateproduced")
	private String dateproduced;
	  @Column(name = "timeproduced")
	private String timeproduced;

	public String getCartnumber() {
		return cartnumber;
	}
	public void setCartnumber(String cartnumber) {
		this.cartnumber = cartnumber;
	}
	public String getContainerid() {
		return containerid;
	}
	public void setContainerid(String containerid) {
		this.containerid = containerid;
	}
	public String getDateproduced() {
		return dateproduced;
	}
	public void setDateproduced(String dateproduced) {
		this.dateproduced = dateproduced;
	}
	public String getTimeproduced() {
		return timeproduced;
	}
	public void setTimeproduced(String timeproduced) {
		this.timeproduced = timeproduced;
	}

}
