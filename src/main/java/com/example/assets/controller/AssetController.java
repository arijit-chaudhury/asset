package com.example.assets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assets.bean.Asset;
import com.example.assets.service.AssetService;

@RestController
public class AssetController {

	@Autowired
	private AssetService service;

	@GetMapping("/getAssets")
	public List<Asset> getAllAssets() {
		return service.getAllAssets();
	}

}
