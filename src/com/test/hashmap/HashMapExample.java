package com.test.hashmap;

import java.util.HashMap;


public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> employeeMap=new HashMap<Integer, String>();
		employeeMap.put(1, "Rohit");
		employeeMap.put(2, "Raman");
		employeeMap.put(3,"Ravi");
		print(employeeMap);

	}
	private static void print(HashMap<Integer, String> emplObject) {
		for(Integer key: emplObject.keySet()){
			System.out.println("EMPID"+key+" EMP NAME IS "+emplObject.get(key));
		}

	}

}
