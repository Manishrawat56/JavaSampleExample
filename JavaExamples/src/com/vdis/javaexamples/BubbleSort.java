package com.vdis.javaexamples;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String[] n=scan.nextLine().split(" ");
		int[] a=new int[Integer.parseInt(n[0])];
		String[] s=scan.nextLine().split(" ");
		for (int i = 0; i < s.length; i++) {
			a[i]=Integer.parseInt(s[i]);
		}
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a.length - 1; j++) {
		        int temp=0;
		        if (a[j] > a[j + 1]) {
		        	temp=a[j];
		        	a[j]=a[j+1];
		        	a[j+1]=temp;
		        }
		    }
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(a[i]+" ");
		}
		scan.close();
	}

}
