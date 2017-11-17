package com.rjprd.gitrd.service;

public class MapService {
	
	MapUtil mapUtil = new MapUtil();
	
	public double distanceBetweenZip(String zipcode1, String zipcode2){
		return mapUtil.calculateDistance(zipcode1, zipcode2, "zipcode");
	}

	public static void main(String[] args) {
		MapService mapService = new MapService();
		double distance = mapService.distanceBetweenZip("22933", "12345");
		System.out.println(distance);
	}
}
