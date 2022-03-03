package com.example.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, String>{
	
	@Query("SELECT b FROM Branch b WHERE b.bcity=:bcity")
	public List<Branch> findBranchesByCity(@Param("bcity") String bcity);

}
