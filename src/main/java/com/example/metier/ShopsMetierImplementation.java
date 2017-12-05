package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Shops;
import com.example.repositories.ShopsRepository;

public class ShopsMetierImplementation implements ShopsMetier {
	
	@Autowired
	private ShopsRepository shopsRepository;

	@Override
	public Shops likeShop(String id) {
		Shops shops = shopsRepository.findOne(id);
		shops.setPreference(2);
		shopsRepository.save(shops);
		return shops;
	}

	@Override
	public Shops dislikeShop(String id) {
		Shops shops = shopsRepository.findOne(id);
		shops.setPreference(1);
		shopsRepository.save(shops);
		return shops;
	}

	@Override
	public Shops removeShop(String id) {
		Shops shops = shopsRepository.findOne(id);
		shops.setPreference(0);
		shopsRepository.save(shops);
		return shops;
	}

}
