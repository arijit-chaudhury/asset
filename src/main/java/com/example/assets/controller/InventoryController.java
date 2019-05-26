package com.example.assets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assets.bean.Inventory;
import com.example.assets.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/getInventories")
	public List<Inventory> getAllInventories() {
		return inventoryService.findAll();
	}

}
