package oop.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        //add key-value pairs to the HashMap
        hashMap.put("apple", 5);
        hashMap.put("orange", 6);
        hashMap.put("banana", 7);

        //access value with key
        System.out.println("apple : " + hashMap.get("apple"));

        //remove with key
        hashMap.remove("orange");

        //Iterate over the HashMap using entrySet
        System.out.println("All items : ");
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
