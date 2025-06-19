package com.bitcoin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitcoin.model.Wallet;

@Repository
public interface Walletrepo extends JpaRepository<Wallet,Long> {

}
