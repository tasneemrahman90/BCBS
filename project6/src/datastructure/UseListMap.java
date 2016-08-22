package datastructure;

import java.util.*;

/**
 * Created by rrt on 8/6/2016.
 */
public class UseListMap {
    public static void main(String[] args) {
        List<String> citiesOfUSA = new ArrayList<String>();
        citiesOfUSA.add("NY");
        citiesOfUSA.add("CO");
        citiesOfUSA.add("LA");

        List<String> citiesOfUK = new ArrayList<String>();
        citiesOfUK.add("London");
        citiesOfUK.add("Kent");
        citiesOfUK.add("Manchester");

        List<String> citiesOfBangladesh = new ArrayList<String>();
        citiesOfBangladesh.add("Dhaka");
        citiesOfBangladesh.add("Comilla");
        citiesOfBangladesh.add("Sylhet");

        List<String> citiesOfCanada = new ArrayList<String>();
        citiesOfCanada.add("Ontario");
        citiesOfCanada.add("Montreal");
        citiesOfCanada.add("Nova Scotia");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("USA", citiesOfUSA);
        map.put("UK", citiesOfUK);
        map.put("Bangladesh", citiesOfBangladesh);
        map.put("Canada", citiesOfCanada);
        System.out.println(".......Retrieve the values by for each loop.......");
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
        System.out.println(".......Retrieve the values by Iterator and While loop.......");
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry data = (Map.Entry)it.next();
            System.out.println(data.getKey() + " " + data.getValue());
        }
    }
}
