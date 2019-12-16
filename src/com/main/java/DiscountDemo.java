package com.main.java;

import java.util.Scanner;

public class DiscountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount : ");
		int purchaseamt = sc.nextInt();
		int finalamount=findFinalAmount(purchaseamt);
		System.out.println("Enter the final amount after discount : " +finalamount);

	}
	
	public static int findFinalAmount(int purchaseamt){
		int finalbill=0;
		if(purchaseamt<=5000){
			finalbill= purchaseamt;
		}
		else if(purchaseamt>5000 && purchaseamt<=5000){
			float discount = (float) 0.10;
			finalbill= (int) (purchaseamt - ((purchaseamt-5000)*discount));
		}
		else if(purchaseamt>10000){
			float discount = (float) 0.20;
			finalbill= (int) ((purchaseamt-500) - ((purchaseamt-10000)*discount));
		}
		return finalbill;
	}

}
