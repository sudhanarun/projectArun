package org.controlstatement;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=1;i<=3;i++)
		{
			System.out.println("Enter your favourite colour and dress:");
			int color=sc.nextInt();
			switch(color)
			{
			case 1:
				System.out.println("Blue is my favourite color");
				break;
			case 2:
				System.out.println("green is my favourite color");
				break;
			case 3:
				System.out.println("saree is my favourite color");
				break;
			case 4:
				System.out.println("jean is my favourite dress");
				break;
			case 5:
				System.out.println("kurtis is my favourite dress");
				break;
			default:
				System.out.println("No one is my favourite");
			}

		}

	}

}
