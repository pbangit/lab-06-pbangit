package com.example.listycity;


/**
 * This is a class that defines city.
 * It has two string variables which are the names of the city and province.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructor for a city with a given name and province.
     * @param city The city name.
     * @param province The province name.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }


    /**
     * This gets the name of the city
     * @return
     *      Returns city name.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This gets the name of the province.
     * @return
     *      Returns province name.
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This function compares this city with another city.
     * @param otherCity The city to compare to.
     * @return
     *      Returns the result of comparing city names.
     */
    @Override
    public int compareTo(City otherCity){
        return this.city.compareTo(otherCity.getCityName());
    }
}
