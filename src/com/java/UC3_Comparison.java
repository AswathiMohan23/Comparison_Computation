package com.java;

import java.util.Scanner;

public class UC3_Comparison {
    public static int EnterTheValues() {
        System.out.println("enter the values in the order x1,x2,y1,y2 : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        return value;
    }
    public static void main(String[] args) {
        System.out.println("enter the co-ordinates of first line : ");
        int x1 = EnterTheValues();
        int x2 = EnterTheValues();
        int y1 = EnterTheValues();
        int y2 = EnterTheValues();
        System.out.println("enter the co-ordinates of second line : ");
        int secondX1 = EnterTheValues();
        int secondX2 = EnterTheValues();
        int secondY1 = EnterTheValues();
        int secondY2 = EnterTheValues();
        Integer length_of_First_Line = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        Integer length_of_Second_Line = ((secondX2 - secondX1) ^ 2 + (secondY2 - secondY1) ^ 2);
        Integer result=Comparison(length_of_First_Line, length_of_Second_Line);
        if (result == 0)
            System.out.println("Length of the first line = length of second line");
        else if (result < 0)
            System.out.println("Length of the first line < length of second line");
        else
            System.out.println("Length of the first line > length of second line");
    }

    public static int Comparison(Integer first, Integer second) {
        Integer length_firstLine = first;
        Integer length_secondLine = second;
        Integer result = length_firstLine.compareTo(length_secondLine);
        return (result);
    }
}



