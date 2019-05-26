package com.example.assets.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assets.bean.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Serializable> {

}
