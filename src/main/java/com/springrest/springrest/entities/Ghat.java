package com.springrest.springrest.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ghat {
	
	@Id
	private long ghatId ;
	private String location ;
	private String openTiming ;
	private String closeTiming ;
	private String latitude;
	private String longitude;
	private Boolean isOpen;
	public Ghat(long ghatId, String location, String openTiming, String closeTiming, String latitude, String longitude,
			Boolean isOpen) {
		super();
		this.ghatId = ghatId;
		this.location = location;
		this.openTiming = openTiming;
		this.closeTiming = closeTiming;
		this.latitude = latitude;
		this.longitude = longitude;
		this.isOpen = isOpen;
	}
	@Override
	public String toString() {
		return "Ghat [ghatId=" + ghatId + ", location=" + location + ", openTiming=" + openTiming + ", closeTiming="
				+ closeTiming + ", latitude=" + latitude + ", longitude=" + longitude + ", isOpen=" + isOpen + "]";
	}
	public Ghat() {
		super();
	}
	
	
}
