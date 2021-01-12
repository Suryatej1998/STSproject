package com.example.po;


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
public class PoController {
	@Autowired
	public Poservice poservice;
	
	@PostMapping("/poinsert")
	public Map insertPo(@RequestBody Po po) {
		Map addpo = null;
				try {
			addpo = poservice.insertPo(po);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				return addpo;
	}
	@CrossOrigin
	@PutMapping("/update")
	public Map update(@RequestBody Po po) {
		return poservice.update(po);
	}

	
	@CrossOrigin
	@GetMapping("/get")
	public List get(@RequestBody Po po) {
		return poservice.get(po.getPoid());
	}

	@CrossOrigin
	@GetMapping("/getAll")
	public List getAll() {
		return poservice.getAll();
	}

	}
