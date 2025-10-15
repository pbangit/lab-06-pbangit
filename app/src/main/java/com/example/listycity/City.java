package com.example.listycity;


/**
 * This is a class that defines city.
 * It has two string variables which are the names of the city and province.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;


    City(String city, String province){
        this.city = city;
        this.province = province;
    }


    String getCityName(){
        return this.city;
    }


    String getProvinceName(){
        return this.province;
    }


    @Override
    public int compareTo(City otherCity){
        City city = (City) otherCity;
        return this.city.compareTo(city.getCityName());
    }
}
