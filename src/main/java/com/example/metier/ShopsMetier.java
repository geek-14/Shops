package com.example.metier;

import com.example.entities.Shops;

public interface ShopsMetier {
	
	public Shops likeShop(String id);
	public Shops dislikeShop(String id);
	public Shops removeShop(String id);

}
