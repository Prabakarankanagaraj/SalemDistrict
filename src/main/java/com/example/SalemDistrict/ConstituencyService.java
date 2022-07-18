package com.example.SalemDistrict;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConstituencyService {
	@Autowired
	ElectionCommission obj;
	
	public String makeDelete(int key) {
		Constituency t=obj.findById(key).orElse(null);
		String msg=t.getArea()+"has been deleted";
		obj.deleteById(key);
		return msg;
		
	}
	
	
	 public String makedel(Constituency scan)
	 {
		 String msg=scan.getArea()+"has Deleted";
		 obj.delete(scan);
		return msg;
		 
	 }
	
	public List<Constituency> makeAreaandWinner(String a,String b)
	{
		return obj.findAllByAreaAndWinner(a, b);
		
	}
	
	public List<Constituency> makeReadWin(String beta){
		return obj.findAllByWinner(beta);
		
	}
	
	public List<Constituency> makeReadAll(String alpha){
		return obj.findAllByParty(alpha);
		
	}
	
	public Optional<Constituency> makeRead(int key) {
		return obj.findById(key);
		
	}
	
	public List<Constituency> makeFetchAll() {
		return (List<Constituency>) obj.findAll();
		
	}
	
	public Constituency newOne(Constituency mob) {
		return obj.save(mob);
				
	}

}
