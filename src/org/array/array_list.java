package org.array;

import java.util.Scanner;

public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Datatype variable name []=new Datatype[length]
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=50;
		System.out.println(a[2]+a[3]);
		String fruits[]= {"apple","orange","mango","banana"};
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		//using scanner class
		int number[]=new int [5];
		Scanner sc=new Scanner(System.in);
		number[0]=sc.nextInt();
		number[1]=sc.nextInt();
		number[2]=sc.nextInt();
		number[3]=sc.nextInt();
		number[4]=sc.nextInt();
		System.out.println(number[0]-number[1]);
		System.out.println(number[2]+number[3]);
		System.out.println(number[4]*number[1]);
	}

}
