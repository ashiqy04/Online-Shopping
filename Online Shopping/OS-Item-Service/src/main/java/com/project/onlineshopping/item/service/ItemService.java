package com.project.onlineshopping.item.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineshopping.item.entity.Item;
import com.project.onlineshopping.item.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;

	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}

	
	public Item findItemByName(String itemName) {
		return itemRepository.findByItemName(itemName);
	}


	public List<Item> findAllItem() {
		List<Item> itemAll = itemRepository.findAll();
		return itemAll;	
		
	}


	public Item findItemById(Long itemId) {
		return itemRepository.findByItemId(itemId);
	}
	

}
