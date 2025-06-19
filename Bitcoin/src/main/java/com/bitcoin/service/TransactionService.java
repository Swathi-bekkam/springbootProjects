package com.bitcoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcoin.model.Transactions;
import com.bitcoin.model.Wallet;
import com.bitcoin.repo.Transactionrepo;
import com.bitcoin.repo.Walletrepo;

@Service
public class TransactionService {
	@Autowired
	private Transactionrepo transactionrepo;
	
	@Autowired
	private Walletrepo walletrepo;
	
	public List<Transactions> gettransaction(Long walletId) {
		return transactionrepo.findByWallet_walletId(walletId);
	}
	

	
	public Transactions initiateTransaction(Transactions transaction)
	{
		Wallet wallet = walletrepo.findById(transaction.getWallet().getWalletId()).orElseThrow(() -> new RuntimeException("wallet not found"));
		
		if("deposit".equalsIgnoreCase(transaction.getTransactionType()))
		{
			wallet.setCurrentBlnc(wallet.getCurrentBlnc() + transaction.getAmount());
		}
		else if("withdrawl".equalsIgnoreCase(transaction.getTransactionType()))
		{
			if(wallet.getCurrentBlnc() < transaction.getAmount())
			{
				throw new RuntimeException("Insufficient balance");
			}
			
			wallet.setCurrentBlnc(wallet.getCurrentBlnc() - transaction.getAmount());
		}
		
		transaction.setTransactionStatus("Completed");
		
		walletrepo.save(wallet);
		return transactionrepo.save(transaction);
	}

}
