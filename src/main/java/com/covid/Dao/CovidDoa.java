package com.covid.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.covid.covidData.*;
import com.covid.Dao.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CovidDoa {

	public int addData(CovidRaw raw) 
	  {	 
		 Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  {  
			  con= covidDB.getConnection();
			  
			  String ins_str = "insert into data_table values(?,?,?,?,?)";
			 
			  pstmt = con.prepareStatement(ins_str);
			  
			  pstmt.setInt(1,raw.getIso_code());
			  pstmt.setString(2,raw.getLocation());
			  pstmt.setString(3,raw.getContinent());
			  
			  pstmt.setInt(4,raw.getNew_cases());
			  pstmt.setInt(5,raw.getTotal_cases());
			 
			
			  int updateCount = pstmt.executeUpdate();  
			       
			  con.close();
			  return updateCount; 
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }
	  }
	
	public ArrayList getCaseDetailsByLocation(String location)
			throws Exception
			{
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				con = covidDB.getConnection();
				
		    String sel_str ="SELECT location, Count(total_cases ) FROM data_table WHERE new_cases> 1000 GROUP BY location";
				  
				  
				  pstmt = con.prepareStatement(sel_str);
				  pstmt.setString(1, location);
				  rs = pstmt.executeQuery();
				  
				  ArrayList result = new ArrayList();
				  if(rs.next())
				  {
					  result.add(rs.getString(1));
					  result.add(rs.getString(2));
					  
				  }
				  else
				  {
					  result.add("Invalid Location");
				  }
				  return result;
				
			}
}
