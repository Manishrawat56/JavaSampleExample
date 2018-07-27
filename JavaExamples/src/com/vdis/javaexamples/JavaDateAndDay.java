package com.vdis.javaexamples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaDateAndDay {

	    public static String getDay(String day, String month,String year){
	        Calendar calendar=Calendar.getInstance();
	        calendar.set(Integer.parseInt(year),(Integer.parseInt(month)-1),Integer.parseInt(day)); //in this line internally set Date, in date we use month +1 that's why we will subtract by 1  In month 
	        Date now = calendar.getTime();
	        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
	        return simpleDateformat.format(now).toUpperCase();
	    } 
	    
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        System.out.println(getDay(day, month, year));
	        in.close();
	    }
	}
