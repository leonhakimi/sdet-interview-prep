package com.infosys.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.demo.dto.AddUpdateHooperDTO;
import com.infosys.demo.model.Hooper;
import com.infosys.demo.service.HooperService;

@RestController
@CrossOrigin(originPatterns = "*", allowCredentials = "true")
public class HooperController {

	@Autowired
	private HooperService hs;

	@GetMapping(path = "/hoopers")
	public List<Hooper> getAllHoopers() {
		List<Hooper> listOfAllHoopers = hs.getAllHoopers();
		return listOfAllHoopers;
	}
	
	@GetMapping(path = "/hoopers/{id}")
	public Hooper getHooperById(@PathVariable(value = "id") String id) {
		
		Hooper hooper = hs.getHooperById(id);
		
		return hooper;
		
	}
	
	@PostMapping(path = "/hoopers")
	public Hooper createHooper(@RequestBody AddUpdateHooperDTO dto) {
		Hooper newHooper = hs.createHooper(dto);
		
		return newHooper;
	}
	
	@PutMapping(path = "/hoopers/{id}")
	public Hooper updateHooper(@PathVariable(value = "id") String id, @RequestBody AddUpdateHooperDTO dto) {
		Hooper updatedHooper = hs.updateHooper(id, dto);
		return updatedHooper;
	}
	
	@DeleteMapping(path = "/hoopers/{id}")
	public void deleteHooper(@PathVariable(value = "id") String id) {
		hs.deleteHooper(id);
	}
}
