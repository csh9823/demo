package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Store;


import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface StoreService {
	public List<Store> storeList();
	public List<HashMap<String, Object>> storelist();
	public void stoupdate(List<HashMap<String, Object>> stoData);
}
