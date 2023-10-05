package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Boat {
	
	@Id
	private long boatId;
	private long ownerId;
	private String boatName;
	private long sourceghatId;
	private String contact;
	private String capacity;
	private String boatType;
	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boat(long boatId, long ownerId, String boatName, long sourceghatId, String contact, String capacity,
			String boatType) {
		super();
		this.boatId = boatId;
		this.ownerId = ownerId;
		this.boatName = boatName;
		this.sourceghatId = sourceghatId;
		this.contact = contact;
		this.capacity = capacity;
		this.boatType = boatType;
	}
	@Override
	public String toString() {
		return "Boat [boatId=" + boatId + ", ownerId=" + ownerId + ", boatName=" + boatName + ", sourceghatId="
				+ sourceghatId + ", contact=" + contact + ", capacity=" + capacity + ", boatType=" + boatType + "]";
	}
	public long getBoatId() {
		return boatId;
	}
	public void setBoatId(long boatId) {
		this.boatId = boatId;
	}
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	public String getboatName() {
		return boatName;
	}
	public void setboatName(String boatName) {
		 this.boatName=boatName;
	}
	public long getsourceghatId() {
		return sourceghatId;
	}
	public void setsourceghatId(long sourceghatId) {
		this.sourceghatId=sourceghatId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getBoatType() {
		return boatType;
	}
	public void setBoatType(String boatType) {
		this.boatType = boatType;
	}
	
	
}
	
