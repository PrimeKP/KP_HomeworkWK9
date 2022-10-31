package week9homework;

import java.util.ArrayList;
/*
4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
public class P04_ColourArrayList {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();

        colour.add("Violet");
        colour.add("Indigo");
        colour.add("blue");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Orange");
        colour.add("Red");

        System.out.println("\nTotal Colours in Rainbow are: " + colour.size() + "\n");
        for (String colourList : colour) {
            System.out.println(colourList);
        }

    }
}

