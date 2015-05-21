package sort;

import java.util.Scanner;

public class inputprogram {

	public static void main(String[] args) {
		int length;
		System.out.println("How many number you are gonna enter");
		Scanner input=new Scanner(System.in);
		length=input.nextInt();
		Integer[] Array=new Integer[length];
		for(int counter=0;counter<length;counter++){
			Array[counter]=input.nextInt();
		}
		
		input.close();
		System.out.println("Entered number are:");
		for(int counter=0;counter<length;counter++){
			System.out.println(Array[counter]);
			
		}
	}

}
