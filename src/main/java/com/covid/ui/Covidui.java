package com.covid.ui;
import java.util.ArrayList;
import java.util.Scanner;

import com.covid.service.CovidService;



public class Covidui {

	public static void main(String[] args) {
		
		int iso_code=0;	
		String continent=" ";
		String location=" ";
		
		int total_cases=0;
		int new_cases=0;	
		
		
		System.out.println("1.Add Covid Data");
		System.out.println("2.Search Data by Location");

		
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Scanner s=new Scanner(System.in);

			System.out.println("Enter iso code");
			iso_code= s.nextInt();
			System.out.println("Enter Continent");
			continent= s.next();
			System.out.println("Enter Location");
			location= s.next();
			
			System.out.println("Enter Total Cases");
			total_cases= s.nextInt();
			System.out.println("Enter new Cases");
			new_cases= s.nextInt();
			
			CovidService service = new CovidService();
			int updateCount = service.addCovidDataService(iso_code, continent, location, total_cases, new_cases);
			
			System.out.println("inserted "+updateCount+" record   Success");
			
			break;
			
		case 2:
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Location");
			location = sc1.next();
			CovidService coService = new CovidService();
		    ArrayList result = coService.getCaseDetailsByIdLocation(location);
		    System.out.println(result);
			break;
		}
		
		
		
		
		
		
		
	}
}
