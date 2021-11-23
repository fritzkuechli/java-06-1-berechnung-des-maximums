package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner inp = new Scanner(System.in);
        boolean question = true;


        do {
            try {
                System.out.println("input your number! ");
                numbers.add(inp.nextInt());
            } catch (Exception e) {
                System.out.println("you wanna q?");
                if (inp.next().equals("q")) {
                    question = false;
                } else {
                   continue;
                }
            }
        } while (question);

        Collections.sort(numbers);

        for (int n : numbers) {
            System.out.format(" %d ", n);
        }
        System.out.println("The maximum element is: " +  numbers.get(numbers.size() -1 ));
    }
}
