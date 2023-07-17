package com.project.onlineshopping.item.repository;

import com.project.onlineshopping.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	Item findByItemName(String itemName);

	Item findByItemId(Long itemId);
	

}
