package com.revature.cryptid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.cryptid.model.Cryptids;

@Repository
public interface CryptidRepository extends JpaRepository<Cryptids, Integer> {
	
	public Cryptids getCryptidByName(String name);

}
