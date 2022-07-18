package com.example.SalemDistrict;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstituencyController {
	@Autowired
	ConstituencyService service;
	
	@DeleteMapping("/delid/{id}")
	public String callingDeleteById(@PathVariable int id)
	{
		return service.makeDelete(id);
		
	}
	
	@PutMapping("/up")
	public Constituency callingup(@RequestBody Constituency up) {
		return service.newOne(up);
		
	}
	
	
	@DeleteMapping("/del")
	public String callingDel(@RequestBody Constituency math) {
		return service.makedel(math);
		
	}
	

	@GetMapping("/both/{one}/{two}")
	public List<Constituency> callingAreaAndWinner(@PathVariable("one") String one,@PathVariable("two") String two)
	{
		return service.makeAreaandWinner(one, two);
		
	}
	
	@GetMapping("/winner/{winn}")
	public List<Constituency> callingWinner(@PathVariable("winn") String winn){
		return service.makeReadWin(winn);
		
	}
	
	@GetMapping("/party/{part}")
	public List<Constituency> callingParty(@PathVariable("part") String part){
		return service.makeReadAll(part);		
	}
	
	@GetMapping("/{hi}")
	public Optional<Constituency> callingOne(@PathVariable("hi") int hi){
		return service.makeRead(hi);
		
	}
	
	@GetMapping("/")
	public List<Constituency> callingAll(){
		return service.makeFetchAll();
		
	}
	
	@PostMapping("/new")
	public Constituency callingMethod(@RequestBody Constituency get) {
		return service.newOne(get);
		
	}
	

}
