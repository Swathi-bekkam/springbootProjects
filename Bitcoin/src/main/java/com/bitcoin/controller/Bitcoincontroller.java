package com.bitcoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitcoin.model.Transactions;
import com.bitcoin.model.Wallet;
import com.bitcoin.service.TransactionService;
import com.bitcoin.service.WalletService;

@RestController
@RequestMapping("/api")
public class Bitcoincontroller {
	@Autowired
	private WalletService walletservice;
	
	@Autowired
	private TransactionService transactionservice;
	
	@PostMapping("/create")
	public Wallet create(@RequestBody Wallet wallet) {
		return walletservice.createwallet(wallet);
	}
	
	@DeleteMapping("/delete/{walletId}")
	public void deletebyid(@PathVariable Long walletId) {
		walletservice.delete(walletId);
		System.out.println("yes deleted");
	}
	
	@GetMapping("/get")
	public List<Wallet> getall() {
		return walletservice.get();	}
	
	@GetMapping("/gettransactions/{walletId}")
	public List<Transactions> gettransactionsbyid(@PathVariable Long walletId){
		return transactionservice.gettransaction(walletId);
		
	}
	
	@PostMapping
    public Transactions initiateTransaction(@RequestBody Transactions transaction) {
        return transactionservice.initiateTransaction(transaction);
    }

}
