package com.ho.sp01.service;

import java.util.List;

import com.ho.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);

}
