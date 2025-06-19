package com.bitcoin.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transactions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long transactionId;
	
	private Date timestamp;
	private Double amount;
	private String transactionType;
	private String transactionStatus;
	
	@ManyToOne
	@JoinColumn(name="fk")
	@JsonBackReference
	private Wallet wallet;

	public Transactions() {
		
	}
	public Transactions(Date timestamp, Double amount, String transactionType, String transactionStatus,
			Wallet wallet) {
		super();
		this.timestamp = timestamp;
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionStatus = transactionStatus;
		this.wallet = wallet;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	

}
