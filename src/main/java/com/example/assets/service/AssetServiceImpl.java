package com.example.assets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.assets.bean.Asset;
import com.example.assets.repository.AssetRepository;

@Service
@Transactional
public class AssetServiceImpl implements AssetService{
	
	@Autowired
	private AssetRepository assetRepository;

	@Override
	public List<Asset> getAllAssets() {
		return assetRepository.findAll();
	}
	
}
