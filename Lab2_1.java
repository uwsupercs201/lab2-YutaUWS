import java.util.Scanner;
public class Lab2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initialize a Scanner
        System.out.print("Enter the x-coordinate of point 1: ");//set the value of x1 from user input
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of point 1: ");//set the value of y1 from user input
        double y1 = input.nextDouble();
        System.out.print("Enter the z-coordinate of point 1: ");//set the value of z1 from user input
        double z1 = input.nextDouble();
        System.out.print("Enter the x-coordinate of point 2: ");//set the value of x2 from user input
        double x2 = input.nextDouble();
        System.out.print("Enter the y-coordinate of point 2: ");//set the value of y2 from user input
        double y2 = input.nextDouble();
        System.out.print("Enter the z-coordinate of point 2: ");//set the value of z2 from user input
        double z2 = input.nextDouble();
        double distance = Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)
                + Math.pow(z1 - z2, 2)));//compute the distance between point1 and point2
        System.out.println("The distance between point 1 and point 2 is: " + distance);
        System.out.printf("The integer part of the distance between point 1 and 2 is: %d", (int) distance);
        double decimal = distance - (int) distance;//decimal part of distance
        System.out.printf("\nThe fractional part of the distance between point 1 and 2 is: %.16f", decimal);
    }
}