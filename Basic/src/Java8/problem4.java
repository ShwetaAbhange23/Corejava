package Java8;

import java.util.Scanner;
public class problem4{
public static void calculateDistance(int t1,int t2){
int u = 10; // in m/s
int a = 5; // in m/s2
int distanceTravel1 = u*t1+((a*t1*t1)/2);
int distanceTravel2 = u*t2+((a*t2*t2)/2);
System.err.println(distanceTravel1);
System.err.println(distanceTravel2);
}
public static void main(String args[]){
int firstValue;
int secondValue;
   Scanner in = new Scanner(System.in);
    firstValue = in.nextInt();
 secondValue = in.nextInt();
 calculateDistance(firstValue,secondValue);
}
}