package com.example.poitems;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PoitemsController {
	@Autowired
	public Poitemsservice poitemsservice;
	
	@PostMapping("/poitemsinsert")
	public Map insertPoitems(@RequestBody Poitems poitems) {
		Map addpoitems = null;
				try {
			addpoitems = poitemsservice.insertPoitems(poitems);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				return addpoitems;
	}
	@CrossOrigin
	@PutMapping("/update")
	public Map update(@RequestBody Poitems poitems) {
		return poitemsservice.update(poitems);
	}

	
	@CrossOrigin
	@GetMapping("/get")
	public List get(@RequestBody Poitems poitems) {
		return poitemsservice.get(poitems.getPoid());
	}

	@CrossOrigin
	@GetMapping("/getAll")
	public List getAll() {
		return poitemsservice.getAll();
	}

	}
