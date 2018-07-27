package com.vdis.javaexamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecursiveFunction {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.print(""+result);
        scanner.close();
    }
	private static int factorial(int n){
		if(n > 1){
			n=n*factorial(n-1);
		}
			return n;
	}
}
