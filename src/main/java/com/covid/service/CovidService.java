package com.covid.service;

import java.util.ArrayList;

import com.covid.covidData.*;
import com.covid.Dao.*;

public class CovidService {

	public int addCovidDataService(int iso_code,String continent,String location,int total_cases,int new_cases)
	{
		CovidDoa pDAO = new CovidDoa(); 
		CovidRaw raw = new CovidRaw(); 
		
		raw.setIso_code(iso_code);
		raw.setContinent(continent);
		raw.setLocation(location);
		raw.setTotal_cases(total_cases);
		raw.setNew_cases(new_cases);
		
		
		int updateResult = 0;
		 try
		 {
			 updateResult = pDAO.addData(raw);
			 return updateResult; 
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
	}
	
	public ArrayList getCaseDetailsByIdLocation(String Location)
	{
		 CovidDoa pDAO1 = new CovidDoa(); 
		 CovidRaw raw1 = new CovidRaw();
		 
	 
		  ArrayList result = new ArrayList();
		 
		  try
		  {

			result = pDAO1.getCaseDetailsByLocation(Location);
			  return result;
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			 
		  }
		return result;
		
	}
}
