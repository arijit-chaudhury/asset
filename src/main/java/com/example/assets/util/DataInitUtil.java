package com.example.assets.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.assets.bean.Asset;
import com.example.assets.bean.Inventory;
import com.example.assets.repository.InventoryRepository;

@Component
@Transactional
public class DataInitUtil implements ApplicationRunner {

	@Autowired
	private InventoryRepository repo;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		Inventory inventory = new Inventory();
		List<Asset> assets;
		Asset asset = null;
		if (repo.count()==0) {
			asset = new Asset();
			asset.setName("HDFC Liquid Fund");
			asset.setValue(1000.00);
			assets = Arrays.asList(asset);
			inventory.setAssets(assets);
			inventory.setName("Arijit's Inventory");
			repo.save(inventory);
		}
	}
}
