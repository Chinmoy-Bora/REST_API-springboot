package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Boatman {

	@Id
	private long boatmanId;
	private long ownerId;
	private long boatId;
	private String name;
	private String contact;
	private Boolean isOwner;
	private String bankAccountNo;
	public Boatman() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boatman(long boatmanId, long ownerId, long boatId, String name, String contact, Boolean isOwner,
			String bankAccountNo) {
		super();
		this.boatmanId = boatmanId;
		this.ownerId = ownerId;
		this.boatId = boatId;
		this.name = name;
		this.contact = contact;
		this.isOwner = isOwner;
		this.bankAccountNo = bankAccountNo;
	}
	@Override
	public String toString() {
		return "Boatman [boatmanId=" + boatmanId + ", OwnerId=" + ownerId + ", boatId=" + boatId + ", name=" + name
				+ ", contact=" + contact + ", isOwner=" + isOwner + ", bankAccountNo=" + bankAccountNo + "]";
	}
}