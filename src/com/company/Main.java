package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //4. 
        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("yellow");
        colors.add("red");

        Scanner in = new Scanner(System.in);

        System.out.println("the value at the index 1 is: "+ colors.get(1));

        System.out.println("Enter a color: ");
        String s = in.nextLine();
        colors.add(s);
        for (String x : colors){
            System.out.println(x);
        }
    }
}
