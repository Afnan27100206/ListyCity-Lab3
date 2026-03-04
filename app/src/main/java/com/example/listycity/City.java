package com.example.listycity;

/**
 * class defines city
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    /**
     * const for city
     * @param city name of the city
     * @param province name of the province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * city name returned
     * @return city name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * province name returned
     * @return province name
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * comparison alphabetically
     */
    @Override
    public int compareTo(City o){
        return this.city.compareTo(o.getCityName());
    }

    /**
     * checks if two cities are equal
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        City other = (City) obj;
        return city.equals(other.city) && province.equals(other.province);
    }

    /**
     * hash code for city
     */
    @Override
    public int hashCode(){
        return city.hashCode() + province.hashCode();
    }
}