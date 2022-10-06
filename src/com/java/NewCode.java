package com.java;

import java.util.Scanner;

public class NewCode {
    public static void main(String[] args) {
        System.out.println("enter the co-ordinates of first line : ");
        int x1 = EnterTheValues();
        int y1 = EnterTheValues();
        int x2 = EnterTheValues();
        int y2 = EnterTheValues();
        System.out.println("enter the co-ordinates of second line : ");
        int second_x1 = EnterTheValues();
        int second_x2 = EnterTheValues();
        int second_y1 = EnterTheValues();
        int second_y2 = EnterTheValues();
        Integer length_of_First_Line = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        Integer length_of_Second_Line = ((second_x2 - second_x1) ^ 2 + (second_y2 - second_y1) ^ 2);

        comparison(length_of_First_Line, length_of_Second_Line);
    }

    public static int EnterTheValues() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("enter the value of co-ordinate : ");
        return value;
    }

    public static void comparison(Integer x, Integer y) {
        Integer length_of_First_Line = x, length_of_Second_Line = y;
        Integer result = length_of_First_Line.compareTo(length_of_Second_Line);
        if (result == 0)
            System.out.println("Length of the first line = length of second line");
        if (result < 0)
            System.out.println("Length of the first line < length of second line");
        if (result > 0)
            System.out.println("Length of the first line > length of second line");

    }
}




