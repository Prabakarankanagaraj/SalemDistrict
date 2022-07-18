package com.example.SalemDistrict;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionCommission extends CrudRepository<Constituency, Integer>{

	public List<Constituency> findAllByWinner(String winner);
	public List<Constituency> findAllByParty(String party);
	
	@Query("from Constituency where area=:type and winner=:won")
	public List<Constituency> findAllByAreaAndWinner(String type,String won);
	
	 
} 
