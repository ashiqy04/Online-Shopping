package com.project.onlineshopping.item.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineshopping.item.entity.Item;
import com.project.onlineshopping.item.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/item")
@Slf4j
public class ItemController {
	
	Logger logger = LoggerFactory.getLogger(ItemController.class);	

	
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/")
	public Item saveItem(@RequestBody Item item) {
		logger.info("Adding a item:" + item);
		return itemService.saveItem(item);
	}
	
	@GetMapping("/items")
	public List<Item> findAllItem() {
		logger.info("Fetching all items");
		return itemService.findAllItem();
	}
	
	@GetMapping("/items/{name}")
	public Item findItemByName(@PathVariable("name") String itemName) {
		logger.info("Finding an item of name:" + itemName);
		return itemService.findItemByName(itemName);
		
	}
	
	@GetMapping("/{id}")
	public Item findByItemId(@PathVariable("id") Long itemId) {
		logger.info("Finding an item id:" + itemId);
		return itemService.findItemById(itemId);


	}

}
