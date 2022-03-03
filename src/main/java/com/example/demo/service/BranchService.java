package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Branch;
import com.example.demo.model.BranchRepository;

@Service
public class BranchService {
	@Autowired
	private BranchRepository br;
	
	public Branch create(Branch branch) {
		return br.save(branch);
	}
	
	public List<Branch> read() {
		return br.findAll();
	}
	
	public Branch read(String bid) {
		Optional<Branch> x = br.findById(bid);
		Branch b=null;
		if(x.isPresent())
			b=x.get();
		return b;
	}
	
	public Branch update(Branch branch) {
		return br.save(branch);
	}
	
	public Branch delete(String bid) {
		Optional<Branch> x = br.findById(bid);
		Branch b=null;
		if(x.isPresent())
		{
			b=x.get();
			br.delete(b);
		}
		return b;
	}	
	
	public List<Branch> findBranchesByCity(String bcity)
	{
		return br.findBranchesByCity(bcity);
	}
}
