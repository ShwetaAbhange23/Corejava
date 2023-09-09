package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int ar[]=new int[10];
		int sum=0;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the element at "+ i +" index position");
			ar[i]=Integer.parseInt(bufferedReader.readLine()); //runtime error i/o - Exception			
			
		}
		
		System.out.println("Original array:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
			
		}
		
		
		System.out.println("Reverse order array:");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+ " ");
			
		}

	}

}
