package com.revature.cryptid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.cryptid.model.Cryptids;
import com.revature.cryptid.repository.CryptidRepository;

@Service("cryptidService")
public class CryptidService {
	
	private CryptidRepository cryptidRepository;
	
	@Autowired
	public void setCrytidRepository(CryptidRepository cryptidRepository) {
		this.cryptidRepository = cryptidRepository;
	}
	
	public List<Cryptids> findAllCryptids() {
		return cryptidRepository.findAll();
	}
	
	public void deleteCryptidById(int id) {
		cryptidRepository.deleteById(id);
	}
	
	public Cryptids getCryptidById(int id) {
		Optional<Cryptids> c = cryptidRepository.findById(id);
		if (c.isPresent()) {
			return c.get();
		} else {
			return null;
		}
	}
	
	public Cryptids findCryptidByName(String name) {
		return cryptidRepository.getCryptidByName(name);
	}
	
	public void createCryptid(Cryptids cryptid) {
		cryptidRepository.save(cryptid);
	}
	
	public int updateCryptid (Cryptids cryptid) {
		Cryptids c = cryptidRepository.save(cryptid);
		if (c != null) {
			return c.getId();
		}else {
			return 0;
		}
	}

}
