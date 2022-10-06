package com.java;

import java.util.Scanner;
//model a line based on a point consisting of (x, y) cordinates using the
// Cartesian system,So that I can calculate its length A Length as
// 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2-y1) ^ 2)
public class CalculateLength {
    public static void main(String[] args) {
        System.out.println("enter the value of X1 co-ordinate : ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("enter the value of Y1 co-ordinate : ");
        int y1 = sc.nextInt();
        System.out.println("enter the value of x2 co-ordinate : ");
        int x2 = sc.nextInt();
        System.out.println("enter the value of Y2 co-ordinate : ");
        int y2 = sc.nextInt();
        int length_ofThe_Line = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of the line = " + length_ofThe_Line);
    }
}
