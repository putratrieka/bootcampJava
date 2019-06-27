package com.eksad.training;

public class Main {
	public static void main(String[] args) {
		int[][] twoDimenetionalArray	= new int[5][8];
		twoDimenetionalArray[2][5] = 16;
		
		
		for (int i = 0; i < twoDimenetionalArray.length; i++) {
			
			for (int  k= 0; k < twoDimenetionalArray[i].length; k++) {
				
				//System.out.print(i + "," + k + " :");
				System.out.print(twoDimenetionalArray[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
//===============================================================
		for (int i = 0; i < twoDimenetionalArray.length; i++) {
			for (int val : twoDimenetionalArray[i]) {	
				//System.out.print(i + "," + val[] + " :");
				//val = val +2;
				System.out.print(val + " ");
				//System.out.println(val[0][0]);
			}
			System.out.println();
		}
		
	}
}
