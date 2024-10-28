package org.controlstatement;

public class break_state {
//exit from the loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++) {
			if(i==7 || i==6) 
				continue;
			//skip the particular loop
			System.out.println(i);			
		}			

	}

}
