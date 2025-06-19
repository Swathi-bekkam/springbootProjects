package com.bitcoin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Wallet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long walletId;
	
	private String walletAddress;
	private Double currentBlnc;
	private String ownerName;
	private String ownerEmail;
	private Date registerDate;
	
	@OneToMany(mappedBy="wallet",cascade=CascadeType.ALL,orphanRemoval=true)
	@JsonManagedReference
	private List<Transactions> transactions=new ArrayList<>();
	
	public Wallet() {
		
	}

	public Wallet(String walletAddress, Double currentBlnc, String ownerName, String ownerEmail, Date registerDate,
			List<Transactions> transactions) {
		super();
		this.walletAddress = walletAddress;
		this.currentBlnc = currentBlnc;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.registerDate = registerDate;
		this.transactions = transactions;
	}

	public Long getWalletId() {
		return walletId;
	}

	public void setWalletId(Long walletId) {
		this.walletId = walletId;
	}

	public String getWalletAddress() {
		return walletAddress;
	}

	public void setWalletAddress(String walletAddress) {
		this.walletAddress = walletAddress;
	}

	public Double getCurrentBlnc() {
		return currentBlnc;
	}

	public void setCurrentBlnc(Double currentBlnc) {
		this.currentBlnc = currentBlnc;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}
	
	
	

}
