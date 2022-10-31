package week9homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
5. Write a Java program to iterate through all elements in an array list using
Iterator.
 */

public class P05_ArrayIterator {
    public static void main(String[] args) {
        arrayListIteration();

    }
    public static void arrayListIteration(){
        ArrayList<String> stringArray = new ArrayList<>();

        stringArray.add("Sky");
        stringArray.add("Air");
        stringArray.add("Fire");
        stringArray.add("Water");
        stringArray.add("Aether");

        Iterator itr = stringArray.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
