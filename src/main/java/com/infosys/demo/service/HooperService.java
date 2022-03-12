package com.infosys.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.demo.dao.HooperDAO;
import com.infosys.demo.dto.AddUpdateHooperDTO;
import com.infosys.demo.model.Hooper;

@Service
public class HooperService {
	
	@Autowired
	HooperDAO hd;

	public List<Hooper> getAllHoopers() {
		return hd.findAll();
	}

	public Hooper getHooperById(String id) {
		int hooperId = Integer.parseInt(id);
		return hd.findById(hooperId).get();
	}

	public Hooper createHooper(AddUpdateHooperDTO dto) {
		Hooper newHooper = new Hooper(dto.getFirstName(), dto.getLastName(), dto.getJerseyNum(), dto.getSalary());
		
		return hd.saveAndFlush(newHooper);
		
		
	}

	public Hooper updateHooper(String id, AddUpdateHooperDTO dto) {
		int hooperId = Integer.parseInt(id);
		
		Hooper hooperToUpdate = getHooperById(id);
		
		hooperToUpdate.setFirstName(dto.getFirstName());
		hooperToUpdate.setLastName(dto.getLastName());
		hooperToUpdate.setJerseyNum(dto.getJerseyNum());
		hooperToUpdate.setSalary(dto.getSalary());
		
		
		return hd.saveAndFlush(hooperToUpdate);
	}

	public void deleteHooper(String id) {
		Hooper hooperToDelete = getHooperById(id);
		
		hd.delete(hooperToDelete);
		
	}

}
