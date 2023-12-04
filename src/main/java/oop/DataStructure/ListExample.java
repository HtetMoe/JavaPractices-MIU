package oop.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<>();

        //add to list
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);

        //print
        System.out.println("dataList : " + dataList);

        //access from list with index
        System.out.println("index 2 : " + dataList.get(2));

        //remove with index
       dataList.remove(3);

        //check is contain 2 ?
        System.out.println("contain 2 ? : " + dataList.contains(2));

        //size
        System.out.println("size : " + dataList.size());
    }
}
