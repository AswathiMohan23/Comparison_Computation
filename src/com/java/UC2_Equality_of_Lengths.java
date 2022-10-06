package com.java;

import java.util.Scanner;

public class UC2_Equality_of_Lengths {
    public static void main(String[] args) {
        System.out.println("enter the co-ordinates of first line : ");
        System.out.println("enter the value of X1 co-ordinate : ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("enter the value of Y1 co-ordinate : ");
        int y1 = sc.nextInt();
        System.out.println("enter the value of x2 co-ordinate : ");
        int x2 = sc.nextInt();
        System.out.println("enter the value of Y2 co-ordinate : ");
        int y2 = sc.nextInt();
        System.out.println("enter the co-ordinates of second line : ");
        System.out.println("enter the value of X1 co-ordinate : ");
        int second_x1 = sc.nextInt();
        System.out.println("enter the value of Y1 co-ordinate : ");
        int second_y1 = sc.nextInt();
        System.out.println("enter the value of x2 co-ordinate : ");
        int second_x2 = sc.nextInt();
        System.out.println("enter the value of Y2 co-ordinate : ");
        int second_y2 = sc.nextInt();
        Integer length_of_First_Line = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        Integer length_of_Second_Line = ((second_x2 - second_x1) ^ 2 + (second_y2 - second_y1) ^ 2);
        System.out.println("Length of the first line = " + length_of_First_Line+"\nLength of second line = "+length_of_Second_Line);
        Boolean result=length_of_First_Line.equals(length_of_Second_Line);
        if(result==true)
            System.out.println("Length of the first line = length of second line");
        else
            System.out.println("Length of the first line not equal to length of second line");


    }
}
