package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListApplication {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 names: \n");
        for (int i = 0; i <= 9; i++){
            names.add(input.nextLine());
        }
        Collections.shuffle(names);

        System.out.print("Shuffled list of names: " + names);

    }
}
