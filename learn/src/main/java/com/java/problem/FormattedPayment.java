package com.java.problem;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.IsoCountryCode;
import java.util.Scanner;

public class FormattedPayment {
	
 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        

	        // Write your code here.
	             Locale locale = null;
	             
	                 NumberFormat formatter1=NumberFormat.getCurrencyInstance(locale.US);  
	          String currency1=formatter1.format(payment);  
	          System.out.println("US: "+currency1);
	          
	               NumberFormat formatter4=NumberFormat.getCurrencyInstance(new Locale("EN","IN"));  
	          String currency4=formatter4.format(payment);  
	          System.out.println("India: " + currency4);
	          
	          NumberFormat formatter=NumberFormat.getCurrencyInstance(locale.CHINA);  
	          String currency=formatter.format(payment);  
	          System.out.println("China: " + currency);
	        
	            NumberFormat formatter2=NumberFormat.getCurrencyInstance(locale.FRANCE);  
	          String currency2=formatter2.format(payment);  
	          System.out.println("France: " + currency2);
	        // System.out.println("US: " + us);
	        // System.out.println("India: " + india);
	        // System.out.println("China: " + china);
	        // System.out.println("France: " + france);
	    }
	}
