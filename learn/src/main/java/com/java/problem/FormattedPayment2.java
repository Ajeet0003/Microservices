package com.java.problem;
import java.math.BigDecimal;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;   
public class FormattedPayment2 {
	    
//	        static double printCurrency(Double dbl,Locale locale){  
//	    // double dbl=10500.3245;  
//	     NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
//	     String currency=formatter.format(dbl);  
//	     return Double.parseDouble(currency);  
//	    } 
//	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Double payment = scanner.nextDouble();
	        scanner.close();

	 
	// Locale locale;
//	      NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
//	      String currency=formatter.format(payment);  
	        // Write your code here.
	        
	      //  NumberFormat formatter=NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat formatter=NumberFormat.getCurrencyInstance(new Locale("en","in"));
	        String currency=formatter.format(payment); 
	        
	 
	        System.out.println(currency);
//	        System.out.println("US: " + printCurrency(payment,Locale.US));
//	        System.out.println("India: Rs." + payment);
//	        System.out.println("China: " + printCurrency(payment,Locale.CHINA));
//	        System.out.println("France: " + printCurrency(payment,Locale.FRANCE));
	    }
	

}
	
//	  
//	static void printCurrency(Locale locale){  
//	 double dbl=10500.3245;  
//	 NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
//	 String currency=formatter.format(dbl);  
//	 System.out.println(currency+" for the locale "+locale);  
//	}  
//	  
//	public static void main(String[] args) {  
//	    printCurrency(Locale.UK);  
//	    printCurrency(Locale.US);  
//	    printCurrency(Locale.FRANCE);  
//	}  
//	}  

