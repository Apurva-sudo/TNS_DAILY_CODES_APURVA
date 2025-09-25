package com.scannerclass;
import java.util.Scanner;


public class ScanneraClassDemo {
	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your ID : ");
			int id = sc.nextInt();
			System.out.println("ID : "+id);
			System.out.println("Enter your Name : ");
			String name= sc.next();
			System.out.println("Name = "+name);
			}
	}


}
