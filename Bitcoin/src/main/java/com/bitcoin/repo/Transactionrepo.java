package com.bitcoin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitcoin.model.Transactions;

@Repository
public interface Transactionrepo extends JpaRepository<Transactions,Long>{
	List<Transactions> findByWallet_walletId(Long walletId);

}
