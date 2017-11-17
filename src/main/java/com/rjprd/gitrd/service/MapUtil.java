package com.rjprd.gitrd.service;

public class MapUtil {
	
	public double calculateDistance(String point1, String point2, String type){
		
		double distance = 0;
		if(type !=null && type.equals("zipcode")){
			distance = Math.random();
		}
		
		return distance;
	}

}
