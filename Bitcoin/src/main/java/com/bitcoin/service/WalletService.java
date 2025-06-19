package com.bitcoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcoin.model.Wallet;
import com.bitcoin.repo.Walletrepo;

@Service
public class WalletService {
	@Autowired
	private Walletrepo walletrepo;
	
	public Wallet createwallet(Wallet wallet) {
		return walletrepo.save(wallet);	}
	
	public void delete(Long walletid) {
		Wallet present=walletrepo.findById(walletid).orElseThrow(() -> new RuntimeException("Wallet not found with ID: " + walletid));
		if(present!=null) {
			walletrepo.deleteById(walletid);
		}
	}
	
	public List<Wallet> get() {
		return walletrepo.findAll();
	}

}
