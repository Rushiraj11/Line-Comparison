package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {
    public static void main (String [] args) {
        //calling Scanner method to take inputs from console
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Cartesian Coordinates");
        System.out.println("Enter x1: ");
       int x1 = sc.nextInt();
        System.out.println("Enter x2: ");
       int x2 = sc.nextInt();
        System.out.println("Enter y1: ");
       int y1 = sc.nextInt();
        System.out.println("Enter y2: ");
       int y2 = sc.nextInt();
        double line1=(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2));
        System.out.println("Length of the line:"+line1);
        System.out.println("Enter Coordinates of next line : ");
        System.out.println("Enter x1 of line 2 : ");
        int x3 = sc.nextInt();
        System.out.println("Enter x2 of line 2 : ");
        int x4 = sc.nextInt();
        System.out.println("Enter y1 of line 2 : ");
        int y3 = sc.nextInt();
        System.out.println("Enter y2 of line 2 : ");
       int y4 = sc.nextInt();
        double line2 =(Math.sqrt(Math.pow((x4-x3),2))+Math.pow((y4-y3) ,2));
        if (line1 == line2)
        {
            System.out.println("Both lines are equal in length.");
        }
        else System.out.println("Both lines are not equal in length.");
    }
}
