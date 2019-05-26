package com.example.assets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.assets.bean.Inventory;
import com.example.assets.repository.InventoryRepository;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;

	@Cacheable(value = "inventory")
	@Override
	public List<Inventory> findAll() {
		return inventoryRepository.findAll();
	}

}
