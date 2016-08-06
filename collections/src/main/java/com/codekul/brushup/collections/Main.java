package com.codekul.brushup.collections;

import java.util.*;

/**
 * Created by aniruddha on 6/8/16.
 */
public class Main {

    public static void main(String[] args) {
       map();
    }

    private static void rawCollection(){

        Collection<String> collection
                = new ArrayList<>();
        collection.add("India");
        collection.add("China");
        collection.add("Japan");
        collection.add("Shri Lanka");

        for (String s : collection)
            System.out.println("Foreach = "+s);

        Iterator<String> it = collection.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        collection.forEach(System.out::print);
    }

    private static void list(){

        List<String> mobiles = new ArrayList<>();

        mobiles.add(0,"Android");
        mobiles.add(1,"Android");

        String mobile = mobiles.get(0);
        mobiles.remove(0);

        for (String s : mobiles)
            System.out.println(s);
    }

    private static void set(){
        Set<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(20);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    private static void map(){

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"India");
        map.put(2,"China");
        map.put(3,"Japan");
        map.put(4,"Shri Lanka");
        map.put(5,"United Kingdom");

       String country = map.get(1);

        map.forEach((integer, s) -> {
            // not useful in Android
        });

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("Value -" +value);
        }
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            System.out.println("Key - "+key);
        }

        Set<Map.Entry<Integer,String>> entrySet =
                map.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key - "+entry.getKey()
                    +" Value - "+entry.getValue());
        }
    }
}
