package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trip {

	@Id
	private long tripId;
	private long boatId;
	private String startingTime;
	private String endingTime;
	private long id;
	private Float avgRating;
	private Long totalpeople;
	private String tripType;
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trip(long tripId, long boatId, String startingTime, String endingTime, long id, Float avgRating,
			Long totalpeople,String tripType) {
		super();
		this.tripId = tripId;
		this.boatId = boatId;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.id = id;
		this.avgRating = avgRating;
		this.totalpeople = totalpeople;
		this.tripType = tripType;
	}
	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", boatId=" + boatId + ", startingTime=" + startingTime + ", endingTime="
				+ endingTime + ", id=" + id + ", avgRating=" + avgRating + ", totalpeople=" + totalpeople + ",tripType=" + tripType + "]";
	}
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public long getBoatId() {
		return boatId;
	}
	public void setBoatId(long boatId) {
		this.boatId = boatId;
	}
	public String getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}
	public String getendingTime() {
		return endingTime;
	}
	public void setendingTime(String endingTime) {
		this.endingTime = endingTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(Float avgRating) {
		this.avgRating = avgRating;
	}
	public Long getTotalpeople() {
		return totalpeople;
	}
	public void setTotalpeople(Long totalpeople) {
		this.totalpeople = totalpeople;
	}
	
	public String gettripType()
	{
		return tripType;
	}
	public void settripType(String tripType)
	{
		this.tripType = tripType;
	}
	
	
}
