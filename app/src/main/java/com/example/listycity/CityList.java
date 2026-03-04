package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * class that keeps a list of city objects
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * adds city to list if city does not exist
     * @param city a city to add
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * sorted list of cities returned
     * @return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * true if city exists in list
     * @param city city to check
     * @return true if city exists
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Removes city
     * @param city city to delete
     */
    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * number of cities in the list returned
     * @return number of cities
     */
    public int countCities(){
        return cities.size();
    }
}