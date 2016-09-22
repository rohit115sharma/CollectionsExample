package com.test.hashmap;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<String, String> countryCapitalMap=new HashMap<String, String>();
		countryCapitalMap.put("India", "Delhi");
		countryCapitalMap.put("Japan", "Tokyo");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("Russia", "Moskow");	
		
		
		for(String key:countryCapitalMap.keySet()){
			System.out.println("Country :  "+key+" Capital : "+countryCapitalMap.get(key));
		}
	}

}
