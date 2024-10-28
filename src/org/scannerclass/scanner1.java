package org.scannerclass;
import java.util.Scanner;
public class scanner1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String name = sc.nextLine();
	        char character = sc.next().charAt(2);
	        int totalmark = sc.nextInt();
	        long mobileNo = sc.nextLong();
	        double cgpa = sc.nextDouble();
	        String n=sc.next();
	        System.out.println("My name is:" + name);
	        System.out.println("print the third character in my name:" + character);
	        System.out.println("Totalmark:" + totalmark);
	        System.out.println("Mobile Number:" + mobileNo);
	        System.out.println("CGPA: " + cgpa);
            System.out.println(n);
	}

}
