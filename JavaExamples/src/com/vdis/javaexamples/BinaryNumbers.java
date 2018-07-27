package com.vdis.javaexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryNumbers {

	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        ArrayList<Integer>list=new ArrayList<Integer>(); 
	        while(n >0){
	        	System.out.println(""+n);
	            list.add(n%2);
	            n=n/2;
	        }
	        System.out.println(""+list);
	        int count=0;
	        for(int i=0;i < list.size();i++){
	            if(list.get(list.size()-1-i) == 1){
	                count++;
	            }else{
	                break;
	            }
	            
	        }
	        System.out.println(""+count);
	        scanner.close();
	    }
}
