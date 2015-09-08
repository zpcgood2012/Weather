package com.zpcgood.weather.utils;

public class Constants {
	//����Province�������
	public static final String CREATE_PROVINCE = "create table Province ( " +
			"id integer primary key autoincrement, " +
			"province_name text, province_code text)";
	//����City�������
	public static final String CREATE_CITY = "create table City (" +
			"id integer primary key autoincrement," +
			"city_name text, city_code text,province_id integer)";
	//����County�������
	public static final String CREATE_COUNTY = "create table County (" +
			"id integer primary key autoincrement," +
			"county_name text, county_code text, city_id integer)";
}
