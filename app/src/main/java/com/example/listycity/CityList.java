package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     * @throws
     *      IllegalArgumentException If candidate city is already in the list.
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This checks if the city is in the list.
     * @return
     *      returns True if in list, False otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This deletes a city if its already in the list.
     * @param
     *      city The city to be deleted
     * @throws
     *      IllegalArgumentException if the city does not exist
     */
    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This counts the number of cities in the list.
     * @return
     *      the number of cities in the list
     */
    public int countCities(){
        return cities.size();
    }



    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
