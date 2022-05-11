package a;
//Created by Santhoshini Arkatala

import java.util.ArrayList;
import java.util.Scanner;

public class Productslist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Products = new ArrayList<>();

        Products.add("Apple\nFruits\n 1Piece\n$12");
        Products.add("Strawberryn\nFruits\n5Pieces\n$1");
        Products.add("Potato\nVegetables\n5lbs\n$5");
        Products.add("Chilli\nVegetables\n1lb\n$1");

        System.out.println(Products.get(0));
        System.out.println(Products.get(1));
        System.out.println(Products.get(2));
        System.out.println(Products.get(3));
    }
}
